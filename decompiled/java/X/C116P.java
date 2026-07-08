package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeCollectListFragmentData;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.base.FavoriteTabItemV2;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.116P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116P implements IChallengeService {
    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Class<? extends Activity> LIZLLL() {
        return ChallengeDetailActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final C0OFL LIZ(Context context, Boolean bool) {
        final String string = context.getString(R.string.fge);
        if ("collect_hashtag".equals(string)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String strSubstring = string.substring(0, 1);
            Locale locale = Locale.ROOT;
            sbLIZ.append(strSubstring.toUpperCase(locale));
            sbLIZ.append(string.substring(1).toLowerCase(locale));
            string = C2188811AlT.LIZIZ(sbLIZ);
        }
        final boolean zBooleanValue = bool.booleanValue();
        return new C0OFL(string, zBooleanValue) { // from class: X.0hVY
            public final Map<String, Integer> LLILLJJLI = new LinkedHashMap();
            public final FavoriteTabItemV2 LLILLL;

            @Override // X.C0OFL
            public final FavoriteTabItemV2 LIZ() {
                return this.LLILLL;
            }

            @C14EU(threadMode = ThreadMode.MAIN)
            public final void onChallengeCollect(C1206750hVZ c1206750hVZ) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILLJJLI;
                Integer num = (Integer) linkedHashMap.get(c1206750hVZ.LIZ.getCid());
                if (num != null && num.intValue() == c1206750hVZ.LIZ.getCollectStatus()) {
                    return;
                }
                linkedHashMap.put(c1206750hVZ.LIZ.getCid(), Integer.valueOf(c1206750hVZ.LIZ.getCollectStatus()));
                if (c1206750hVZ.LIZ.getCollectStatus() == 1) {
                    C0OFL.LIZLLL(this.LL, 1);
                } else {
                    C0OFL.LIZIZ(this.LL);
                }
            }

            {
                this.LLILLL = new FavoriteTabItemV2(new ChallengeCollectListFragmentData(zBooleanValue), string, "challenge", "hashtags");
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final Challenge LIZJ(int i, String str, boolean z) {
        return AnonymousClass1162.LIZ(i, str, null, z).challenge;
    }

    @Override // com.ss.android.ugc.aweme.challenge.service.IChallengeService
    public final void LIZIZ(final String str, final String str2, final String str3, final Music music, final C116S c116s) {
        C15O7<ChallengeDetail> c15o7LIZIZ;
        final boolean z = false;
        if (((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIZILJ(str2) && !C10EU.LJIIIIZZ()) {
            c15o7LIZIZ = AnonymousClass1162.LJII.LIZ(str2, null, 0, 0);
        } else {
            c15o7LIZIZ = AnonymousClass1162.LJII.LIZIZ(str2, null, 0, 0);
            z = true;
        }
        c15o7LIZIZ.LJII(new InterfaceC2385309Wh() { // from class: X.1166
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                Challenge challenge;
                boolean z2 = z;
                String str4 = str2;
                C1C7U.LIZ("ChallengeService@75ae.fetchChallengeByMusic$1L");
                if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && c15o7.LJIIL() != null) {
                    if (z2 && (challenge = ((ChallengeDetail) c15o7.LJIIL()).challenge) != null && ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIJJ(challenge) && !C10EU.LJIIIIZZ()) {
                        ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJ(challenge);
                        C15O7<ChallengeDetail> c15o7LIZ = AnonymousClass1162.LJII.LIZ(str4, str4, 0, 0);
                        C1C7U.LIZIZ("ChallengeService@75ae.fetchChallengeByMusic$1L");
                        return c15o7LIZ;
                    }
                    C1C7U.LIZIZ("ChallengeService@75ae.fetchChallengeByMusic$1L");
                    return c15o7;
                }
                C1C7U.LIZIZ("ChallengeService@75ae.fetchChallengeByMusic$1L");
                return null;
            }
        }, C15O7.LJI).LJ(new InterfaceC2385309Wh<ChallengeDetail, Object>(str, str3, music, c116s) { // from class: X.116R
            public final String LIZ;
            public final String LIZIZ;
            public final Music LIZJ;
            public final C116S LIZLLL;

            /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[PHI: r3 r4
              0x0083: PHI (r3v1 com.ss.android.ugc.aweme.music.model.Music) = 
              (r3v0 com.ss.android.ugc.aweme.music.model.Music)
              (r3v0 com.ss.android.ugc.aweme.music.model.Music)
              (r3v0 com.ss.android.ugc.aweme.music.model.Music)
              (r3v3 com.ss.android.ugc.aweme.music.model.Music)
              (r3v3 com.ss.android.ugc.aweme.music.model.Music)
              (r3v3 com.ss.android.ugc.aweme.music.model.Music)
             binds: [B:3:0x000f, B:5:0x0015, B:7:0x001d, B:31:0x009b, B:33:0x00a1, B:35:0x00ad] A[DONT_GENERATE, DONT_INLINE]
              0x0083: PHI (r4v1 java.lang.String) = 
              (r4v0 java.lang.String)
              (r4v0 java.lang.String)
              (r4v0 java.lang.String)
              (r4v3 java.lang.String)
              (r4v3 java.lang.String)
              (r4v3 java.lang.String)
             binds: [B:3:0x000f, B:5:0x0015, B:7:0x001d, B:31:0x009b, B:33:0x00a1, B:35:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
            @Override // X.InterfaceC2385309Wh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object then(X.C15O7<com.ss.android.ugc.aweme.challenge.model.ChallengeDetail> r12) {
                /*
                    r11 = this;
                    java.lang.String r10 = "FetchChallengeByMusicUiContinuation@cee1.then"
                    X.C1C7U.LIZ(r10)
                    java.lang.String r4 = r11.LIZIZ
                    com.ss.android.ugc.aweme.music.model.Music r3 = r11.LIZJ
                    boolean r0 = r12.LJIILIIL()
                    r2 = 1
                    r9 = 0
                    if (r0 != 0) goto L83
                    boolean r0 = r12.LJIILL()
                    if (r0 != 0) goto L83
                    java.lang.Object r5 = r12.LJIIL()
                    com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r5 = (com.ss.android.ugc.aweme.challenge.model.ChallengeDetail) r5
                    if (r5 == 0) goto L83
                    com.ss.android.ugc.aweme.discover.model.Challenge r6 = r5.challenge
                    java.util.List r7 = r6.getConnectMusics()
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService> r0 = com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r0 = (com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService) r0
                    boolean r0 = r0.LIZLLL()
                    if (r0 != 0) goto L59
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r0 = com.ss.android.ugc.aweme.services.IExternalService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
                    com.ss.android.ugc.aweme.services.video.IAVPublishService r0 = r0.publishService()
                    java.lang.String r1 = r0.getShootWay()
                    boolean r0 = r6.isCommerce()
                    if (r0 == 0) goto L85
                    java.lang.String r0 = "challenge"
                    boolean r0 = android.text.TextUtils.equals(r1, r0)
                    if (r0 == 0) goto L85
                L59:
                    boolean r0 = X.C086I.LIZIZ(r7)
                    if (r0 != 0) goto L85
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    java.util.Iterator r7 = r7.iterator()
                L68:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L7e
                    java.lang.Object r1 = r7.next()
                    com.ss.android.ugc.aweme.music.model.Music r1 = (com.ss.android.ugc.aweme.music.model.Music) r1
                    boolean r0 = r1.isCommercialMusic()
                    if (r0 == 0) goto L68
                    r8.add(r1)
                    goto L68
                L7e:
                    r6.setConnectMusics(r8)
                    r7 = r8
                    goto L87
                L83:
                    r2 = 0
                    goto Laf
                L85:
                    if (r7 == 0) goto L99
                L87:
                    int r0 = r7.size()
                    if (r0 <= 0) goto L99
                    X.116S r1 = r11.LIZLLL
                    java.lang.String r0 = r11.LIZ
                    boolean r0 = r1.LIZ(r6, r0)
                    if (r0 != 0) goto L99
                    r4 = r9
                    r3 = r9
                L99:
                    com.ss.android.ugc.aweme.discover.model.Challenge r0 = r5.challenge
                    if (r0 == 0) goto L83
                    boolean r0 = r0.isCommerce()
                    if (r0 == 0) goto L83
                    com.ss.android.ugc.aweme.discover.model.Challenge r0 = r5.challenge
                    java.util.List r0 = r0.getConnectMusics()
                    boolean r0 = X.C086I.LIZIZ(r0)
                    if (r0 != 0) goto L83
                Laf:
                    X.116S r0 = r11.LIZLLL
                    r0.LIZIZ(r3, r4, r2)
                    X.C1C7U.LIZIZ(r10)
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C116R.then(X.15O7):java.lang.Object");
            }

            {
                this.LIZ = str;
                this.LIZIZ = str3;
                this.LIZJ = music;
                this.LIZLLL = c116s;
            }
        }, C15O7.LJIIIIZZ, null);
    }
}
