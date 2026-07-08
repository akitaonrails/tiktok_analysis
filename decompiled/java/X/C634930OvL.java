package X;

import Y.ARunnableS131S0100000_31;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.ss.android.ugc.gamora.recorder.AddYoursAvatarHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS43S0500000_8;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0OvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634930OvL {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final C19EG LIZ;
    public final Aweme LIZIZ;
    public final AddYourRecordParam LIZJ;
    public C15L9 LIZLLL;
    public final MusicModel LJ;
    public final AddYoursAvatarHelper LJFF;
    public ProgressDialogC1399760mWs LJI;
    public long LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public boolean LJIIJ;
    public final C634950OvN LJIIJJI;
    public boolean LJIIL;

    public final void LIZIZ() {
        Long lLJIILIIL;
        String topicId = this.LIZJ.getTopicId();
        if (topicId == null || (lLJIILIIL = C2095008Iq.LJIILIIL(topicId)) == null) {
            return;
        }
        long jLongValue = lLJIILIIL.longValue();
        if (jLongValue == 0 || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        this.LJIIL = true;
        new SafeHandler(this.LIZ).post(new ARunnableS131S0100000_31(this, 89));
        AddYoursAvatarHelper.LIZ(jLongValue, new AwS623S0100000_9(this, 143));
    }

    public final boolean LIZJ() {
        AddYoursStickerStruct addYoursStickerStruct;
        Aweme aweme = this.LIZIZ;
        return aweme != null && C1697810uHb.LJIILJJIL(41, 150, 152).contains(Integer.valueOf(aweme.getAwemeType())) && ((Number) C0ARL.LIZ.getValue()).intValue() > 0 && !this.LIZJ.getForceLandRecordPage() && !this.LIZJ.getAutoEnterStickerEdit() && ((addYoursStickerStruct = this.LIZJ.getAddYoursStickerStruct()) == null || addYoursStickerStruct.getTopicType() != 2);
    }

    public final void LJ() {
        final C15L9 c15l9;
        if (this.LIZIZ == null || this.LJ == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || (c15l9 = this.LIZLLL) == null) {
            return;
        }
        MusicModel musicModel = this.LJ;
        final String str = this.LJIIIIZZ;
        final int i = this.LJIIIZ;
        boolean zLJI = MethodIDManager.LJI(137918);
        C0P0I.LIZ(musicModel, new C0P0F<MusicModel>() { // from class: X.0OvO
            public final /* synthetic */ boolean LIZIZ = true;
            public final /* synthetic */ boolean LIZJ = true;

            @Override // X.C0P0F
            public final void onStart() {
            }

            @Override // X.C0P0F
            public final void LIZ(MusicModel musicModel2) {
                C15L9 c15l92 = c15l9;
                String str2 = str;
                boolean z = this.LIZIZ;
                boolean z2 = this.LIZJ;
                c15l92.LIZJ(i, musicModel2, str2, z, z2, false, false, false, false, false);
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJFF() {
        Long topicId;
        MusicModel musicModel;
        List<AddYoursAvatar> userAvatars;
        List<AddYoursAvatar> userAvatars2;
        AddYoursStickerStruct addYoursStickerStruct;
        String strLJJLIIIJLLLLLLLZ;
        String text;
        AddYoursStickerStruct addYoursStickerStructCopy;
        AddYoursStickerStruct addYoursStickerStruct2;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C0XPD.LIZIZ(this.LIZ, "add_yours", "add_yours", null, new C639000P4o(this, 4));
            return;
        }
        AddYoursStickerStruct addYoursStickerStruct3 = this.LIZJ.getAddYoursStickerStruct();
        if (addYoursStickerStruct3 != null && Intrinsics.LJFF(addYoursStickerStruct3.getEoyCampaign(), Boolean.TRUE) && (addYoursStickerStruct2 = this.LIZJ.getAddYoursStickerStruct()) != null && addYoursStickerStruct2.getEoyCampaignSchema() != null && this.LIZJ.isFollowAY() && !this.LIZJ.getAutoEnterStickerEdit()) {
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C19EG c19eg = this.LIZ;
            String addYoursEnterMethod = this.LIZJ.getAddYoursEnterMethod();
            AddYoursStickerStruct addYoursStickerStruct4 = this.LIZJ.getAddYoursStickerStruct();
            c19651011uW.LJFF(c19eg, addYoursEnterMethod, addYoursStickerStruct4 != null ? addYoursStickerStruct4.getEoyCampaignSchema() : null);
            return;
        }
        this.LJII = System.currentTimeMillis();
        if (this.LIZJ.isFollowAY()) {
            User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
            AddYourRecordParam addYourRecordParam = this.LIZJ;
            AddYoursStickerStruct addYoursStickerStruct5 = addYourRecordParam.getAddYoursStickerStruct();
            if (addYoursStickerStruct5 == null || (addYoursStickerStructCopy = addYoursStickerStruct5.copy(addYoursStickerStruct5.topicId, addYoursStickerStruct5.fromItemId, addYoursStickerStruct5.text, addYoursStickerStruct5.shootFrom, addYoursStickerStruct5.userAvatars, addYoursStickerStruct5.videoCount, addYoursStickerStruct5.fromQuestion, addYoursStickerStruct5.addYoursInvitees, addYoursStickerStruct5.viewerInvited, addYoursStickerStruct5.timeStamp, addYoursStickerStruct5.fontSize, addYoursStickerStruct5.eoyCampaign, addYoursStickerStruct5.eoyCampaignSchema, addYoursStickerStruct5.topicType)) == null) {
                addYoursStickerStructCopy = null;
            } else {
                List<AddYoursAvatar> userAvatars3 = addYoursStickerStructCopy.getUserAvatars();
                if (userAvatars3 != null) {
                    ArrayList arrayList = new ArrayList(userAvatars3);
                    String uid = currentUser.getUid();
                    if (uid != null) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                ListProtector.add(arrayList, 0, new AddYoursAvatar(C2095008Iq.LJIILIIL(uid), currentUser.getAvatarThumb(), currentUser.getNickname()));
                                C13LP.LL(arrayList, 3);
                                break;
                            } else if (Intrinsics.LJFF(String.valueOf(((AddYoursAvatar) it2.next()).getUid()), uid)) {
                                break;
                            }
                        }
                    }
                }
            }
            addYourRecordParam.setAddYoursStickerStruct(addYoursStickerStructCopy);
        }
        AddYoursStickerStruct addYoursStickerStruct6 = this.LIZJ.getAddYoursStickerStruct();
        String text2 = addYoursStickerStruct6 != null ? addYoursStickerStruct6.getText() : null;
        if (text2 == null || text2.length() <= 40) {
            text2 = null;
        }
        if (text2 != null && (addYoursStickerStruct = this.LIZJ.getAddYoursStickerStruct()) != null) {
            AddYoursStickerStruct addYoursStickerStruct7 = this.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct7 == null || (text = addYoursStickerStruct7.getText()) == null) {
                strLJJLIIIJLLLLLLLZ = null;
            } else {
                IntRange intRange = new IntRange(0, 40);
                strLJJLIIIJLLLLLLLZ = intRange.isEmpty() ? "" : a0.LJJLIIIJLLLLLLLZ(text, intRange);
            }
            addYoursStickerStruct.setText(strLJJLIIIJLLLLLLLZ);
        }
        AddYoursStickerStruct addYoursStickerStruct8 = this.LIZJ.getAddYoursStickerStruct();
        if (addYoursStickerStruct8 == null || (userAvatars = addYoursStickerStruct8.getUserAvatars()) == null || userAvatars.isEmpty()) {
            AddYoursStickerStruct addYoursStickerStruct9 = this.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct9 != null && (topicId = addYoursStickerStruct9.getTopicId()) != null) {
                final long jLongValue = topicId.longValue();
                this.LJFF.getClass();
                AddYoursAvatarHelper.LIZLLL = null;
                Map<Long, List<AddYoursAvatar>> map = AddYoursAvatarHelper.LIZJ;
                if (map.containsKey(Long.valueOf(jLongValue))) {
                    AddYoursAvatarHelper.LIZLLL = (List) ((LinkedHashMap) map).get(Long.valueOf(jLongValue));
                } else {
                    ((AddYoursAvatarHelper.Api) AddYoursAvatarHelper.LIZIZ.getValue()).getTopics(jLongValue, "").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0NKT
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            List<AddYoursAvatar> listLIZ;
                            List<AddYoursAvatar> userAvatars4;
                            C1C7U.LIZ("AddYoursAvatarHelper@2b20.requestAvatar$1");
                            AddYoursAvatarHelper.Response response = (AddYoursAvatarHelper.Response) obj;
                            Integer num = response.statusCode;
                            if (num != null && num.intValue() == 0) {
                                AddYoursStickerStruct addYoursStickerStruct10 = response.sticker;
                                if (addYoursStickerStruct10 != null && (userAvatars4 = addYoursStickerStruct10.getUserAvatars()) != null) {
                                    listLIZ = C0NSK.LIZ(userAvatars4);
                                } else {
                                    listLIZ = null;
                                }
                                AddYoursAvatarHelper.LIZLLL = listLIZ;
                                if (listLIZ != null && !listLIZ.isEmpty()) {
                                    AddYoursAvatarHelper.LIZJ.put(Long.valueOf(jLongValue), listLIZ);
                                }
                            }
                            C1C7U.LIZIZ("AddYoursAvatarHelper@2b20.requestAvatar$1");
                        }
                    });
                }
            }
        } else {
            AddYoursStickerStruct addYoursStickerStruct10 = this.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct10 != null) {
                AddYoursStickerStruct addYoursStickerStruct11 = this.LIZJ.getAddYoursStickerStruct();
                addYoursStickerStruct10.setUserAvatars((addYoursStickerStruct11 == null || (userAvatars2 = addYoursStickerStruct11.getUserAvatars()) == null) ? null : C0NSK.LIZ(userAvatars2));
            }
        }
        if (this.LIZIZ == null || (musicModel = this.LJ) == null) {
            C634940OvM.LIZ(this.LIZJ, true, System.currentTimeMillis() - this.LJII, "", "");
            LJI(null, null);
        } else {
            C15L9 c15l9 = this.LIZLLL;
            if (c15l9 != null) {
                c15l9.LJ(musicModel, this.LJIIIIZZ, false, this.LJIIIZ, false, false, false);
            }
        }
    }

    public static ArrayList LIZ(String str) {
        List listLL;
        if (str != null) {
            if (str.length() != 0) {
                ArrayList arrayList = new ArrayList();
                List<String> listSplit = new Regex(",").split(str, 0);
                if (!listSplit.isEmpty()) {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    listLL = C13BV.INSTANCE;
                } else {
                    listLL = C13BV.INSTANCE;
                }
                for (String str2 : (String[]) listLL.toArray(new String[0])) {
                    if (!arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                return arrayList;
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public final void LJI(MusicModel musicModel, String str) {
        T t;
        C259800zU c259800zU = new C259800zU();
        C15L9 c15l9 = this.LIZLLL;
        if (c15l9 != null) {
            t = c15l9.LJI;
        } else {
            t = 0;
        }
        c259800zU.element = t;
        if (musicModel == null) {
            c259800zU.element = null;
        }
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        if (TextUtils.isEmpty("")) {
            c259800zU2.element = UUID.randomUUID().toString();
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("AddYoursRecord", new C15M4(this, c259800zU2, c259800zU, musicModel, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C634930OvL(X.C19EG r5, com.ss.android.ugc.aweme.feed.model.Aweme r6, com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.LIZ = r5
            r4.LIZIZ = r6
            r4.LIZJ = r7
            r3 = 0
            if (r6 == 0) goto L6a
            com.ss.android.ugc.aweme.music.model.Music r2 = r6.getMusic()
            if (r2 == 0) goto L6a
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService> r0 = com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService r0 = (com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService) r0
            boolean r0 = r0.LIZJ(r2)
            if (r0 != 0) goto L6a
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r2.convertToMusicModel()
        L28:
            r4.LJ = r0
            if (r6 == 0) goto L30
            java.lang.String r3 = r6.getStickerIDs()
        L30:
            com.ss.android.ugc.gamora.recorder.AddYoursAvatarHelper r0 = com.ss.android.ugc.gamora.recorder.AddYoursAvatarHelper.LIZ
            r4.LJFF = r0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r2 = 0
            if (r0 != 0) goto L67
            java.util.ArrayList r1 = LIZ(r3)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L67
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
        L4b:
            r4.LJIIIIZZ = r0
            if (r6 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.Video r0 = r6.getVideo()
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.feed.model.Video r0 = r6.getVideo()
            int r2 = r0.getVideoLength()
        L5d:
            r4.LJIIIZ = r2
            X.0OvN r0 = new X.0OvN
            r0.<init>(r4)
            r4.LJIIJJI = r0
            return
        L67:
            java.lang.String r0 = ""
            goto L4b
        L6a:
            r0 = r3
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C634930OvL.<init>(X.19EG, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam):void");
    }

    public final void LIZLLL(AsyncAVService asyncAVService, RecordConfig recordConfig, MusicModel musicModel, Function0<Unit> function0) {
        final C19EG c19eg = this.LIZ;
        TokenCert tokenCert = new TokenCert("bpea-add_yours_storage_permission");
        final AwS43S0500000_8 awS43S0500000_8 = new AwS43S0500000_8(this, (C634930OvL) asyncAVService, (AsyncAVService) recordConfig, (RecordConfig) musicModel, (MusicModel) function0, (Function0<Unit>) 1);
        if (c19eg != null) {
            C0LGY c0lgy = C0LGY.LIZ;
            C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
            InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe(this) { // from class: X.05jo
                public final /* synthetic */ Function0<Unit> LIZ = null;
                public final /* synthetic */ Function0<Unit> LIZJ = null;

                @Override // X.InterfaceC540100LGe
                public final void LIZ(int[] iArr, String[] strArr) {
                    Activity activity = c19eg;
                    Function0<Unit> function02 = this.LIZJ;
                    Function1<Boolean, Unit> function1 = awS43S0500000_8;
                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                    C19EG c19eg2 = (C19EG) activity;
                    c1397580mTM.LJI(c19eg2.getString(2131849191));
                    c1397580mTM.LIZIZ(c19eg2.getString(2131849190));
                    c1397580mTM.LJII = true;
                    C985403tE.LIZ(c1397580mTM, new AwS211S0300000_2(activity, (Activity) function02, (Function0<Unit>) function1, (Function1<? super Boolean, Unit>) 8));
                    new AutoDismissPermissionDialog(c19eg2, c1397580mTM).LIZ();
                    Function0<Unit> function03 = this.LIZ;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }
            };
            C0LGZ c0lgz = new C0LGZ() { // from class: X.0Mey
                @Override // X.C0LGZ
                public final void LIZ(C0L9U c0l9u, String[] strArr, int[] iArr) {
                    Function1<Boolean, Unit> function1 = awS43S0500000_8;
                    if (function1 != null) {
                        function1.invoke(Boolean.TRUE);
                    }
                }
            };
            c0lgy.getClass();
            C0LGY.LJIIJ(c19eg, tokenCert, c0l91, interfaceC540100LGe, c0lgz);
        }
    }
}
