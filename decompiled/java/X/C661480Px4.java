package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lcp.SearchLcpExperiment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0Px4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661480Px4 extends C664340Q4a implements InterfaceC661730PxT {
    public final WeakReference<ISearchContextAbility> LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;
    public Long LLJJJ;
    public long LLJJJIL;
    public String LLJJJJ;

    @Override // X.InterfaceC661730PxT
    public final void LIZLLL(int i, int i2, long j) {
    }

    @Override // X.C664340Q4a, X.InterfaceC661680PxO, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    public final void LJJI() {
        C653660PkS c653660PkSLJIIIZ;
        List<PhotoModeImageUrlModel> imageList;
        if (C1833407Ga.LIZ() && this.LLJJIJIIJIL > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIJIIJIL;
            Aweme awemeLJII = LJII();
            if (awemeLJII != null && (c653660PkSLJIIIZ = LJIIIZ()) != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("search_id", c653660PkSLJIIIZ.LJIIJ);
                c2344009Gk.LJIIIIZZ("search_result_id", c653660PkSLJIIIZ.LJJLI.invoke(awemeLJII));
                c2344009Gk.LJIIIIZZ("search_keyword", c653660PkSLJIIIZ.LJFF);
                c2344009Gk.LJIIIIZZ("enter_from", c653660PkSLJIIIZ.LJIIIIZZ);
                c2344009Gk.LJIIIIZZ("search_type", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLJJLI);
                c2344009Gk.LJIIIIZZ("group_id", awemeLJII.getAid());
                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(awemeLJII));
                Function1<? super Aweme, String> function1 = c653660PkSLJIIIZ.LJJLIIIJL;
                C661490Px5 c661490Px5 = this.LL;
                c2344009Gk.LJIIIIZZ("list_item_id", function1.invoke(c661490Px5 != null ? c661490Px5.LIZJ : null));
                c2344009Gk.LJIIIIZZ("token_type", c653660PkSLJIIIZ.LJJII);
                c2344009Gk.LIZJ(0, "is_fullscreen");
                c2344009Gk.LIZJ(C1EE2.LIZIZ.LJJIJIL(awemeLJII), "video_duration");
                c2344009Gk.LIZJ(awemeLJII.getAwemeType(), "aweme_type");
                PhotoModeImageInfo photoModeImageInfo = awemeLJII.getPhotoModeImageInfo();
                c2344009Gk.LIZJ((photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null) ? 0 : imageList.size(), "pic_cnt");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "play_duration");
                c2344009Gk.LIZJ(0, "post_stay_duration");
                C20684815ws.LJIILLIIL("post_stay_time", c2344009Gk.LIZ);
            }
        }
        this.LLJJJ = null;
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC661730PxT
    public final void LIZJ(View view) {
        int i;
        C662760Pz8 c662760Pz8;
        if (SearchLcpExperiment.LIZIZ()) {
            if (!C0P7Y.LIZ()) {
                C1848530yCh.LIZ(view, "card_photo_album", new AwS589S0100000_10(this, 389));
                return;
            }
            C653660PkS c653660PkSLJIIIZ = LJIIIZ();
            if (c653660PkSLJIIIZ != null && (c662760Pz8 = c653660PkSLJIIIZ.LJJL) != null) {
                C662750Pz7.LIZ.getClass();
                C662750Pz7.LJII(view, c662760Pz8);
                return;
            }
            C662750Pz7 c662750Pz7 = C662750Pz7.LIZ;
            C661490Px5 c661490Px5 = this.LL;
            if (c661490Px5 != null) {
                i = c661490Px5.LJJIFFI;
            } else {
                i = -1;
            }
            c662750Pz7.getClass();
            C662750Pz7.LJI(i, view, "card_photo_album");
        }
    }

    public final void LJJ(View view) {
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C19EG c19egLIZIZ;
        C661550PxB c661550PxBLJ;
        if (C1833407Ga.LIZ()) {
            this.LLJJIJIIJIL = System.currentTimeMillis();
            C661490Px5 c661490Px5 = this.LL;
            if (c661490Px5 != null && (c661550PxBLJ = c661490Px5.LJ()) != null) {
                c661550PxBLJ.LIZ(this.LLJJIJIIJIL);
            }
        }
        C661490Px5 c661490Px52 = this.LL;
        if (c661490Px52 != null && (aweme = c661490Px52.LIZJ) != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() == 1 && !this.LLJJIJI) {
            this.LLJJJ = Long.valueOf(System.currentTimeMillis());
            AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
            AnonymousClass0956 anonymousClass0956LJ = null;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Context context = this.LL.getContext();
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            } else {
                c19egLIZIZ = null;
            }
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJI = SAFHelper.LJIJI(view, c19egLIZIZ);
            if (lifecycleOwnerLJIJI != null) {
                anonymousClass0956LJ = C948503nH.LJ(lifecycleOwnerLJIJI, C23271099x.INSTANCE, new C661500Px6(this, null));
            }
            this.LLJJIJIL = anonymousClass0956LJ;
        }
    }

    @Override // X.C664340Q4a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
        this.LLJJIJI = false;
    }

    public C661480Px4(C661490Px5 c661490Px5, ISearchContextAbility iSearchContextAbility) {
        super(c661490Px5, iSearchContextAbility);
        this.LLJJIII = new WeakReference<>(iSearchContextAbility);
    }

    @Override // X.InterfaceC661730PxT
    public final void LJ(View view, boolean z) {
        if (!z) {
            return;
        }
        int i = -1;
        if (SearchLcpExperiment.LIZ()) {
            C0P8S c0p8sLIZ = C0P8S.LJIJJLI.LIZ();
            C661490Px5 c661490Px5 = this.LL;
            if (c661490Px5 != null) {
                i = c661490Px5.LJJIFFI;
            }
            c0p8sLIZ.LJIIIZ(i);
            return;
        }
        if (!SearchLcpExperiment.LIZIZ()) {
            return;
        }
        C661490Px5 c661490Px52 = this.LL;
        if (c661490Px52 != null) {
            i = c661490Px52.LJJIFFI;
        }
        C662750Pz7.LIZLLL(i, view, String.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC661730PxT
    public final void LIZIZ(int i, int i2, int i3) {
        boolean z;
        Function1<? super Aweme, String> function1;
        String strInvoke;
        Function1<? super Aweme, String> function12;
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C661490Px5 c661490Px5 = this.LL;
        if (c661490Px5 != null && (aweme = c661490Px5.LIZJ) != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        String strInvoke2 = null;
        if (z && !this.LLJJIJI) {
            Long l = this.LLJJJ;
            if (l != null) {
                long jCurrentTimeMillis = this.LLJJJIL + (System.currentTimeMillis() - l.longValue());
                this.LLJJJIL = jCurrentTimeMillis;
                if (jCurrentTimeMillis >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                    AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LLJJIJI = true;
                    C653660PkS c653660PkSLJIIIZ = LJIIIZ();
                    if (c653660PkSLJIIIZ != null && (function12 = c653660PkSLJIIIZ.LJJLIIIJL) != null) {
                        strInvoke = function12.invoke(LJII());
                    } else {
                        strInvoke = null;
                    }
                    if (C123100dR.LIZ(strInvoke)) {
                        LJIILLIIL(C2097908Jt.LIZJ(new Pair("search_third_item_id", strInvoke)));
                    } else {
                        LJIILLIIL(C2097608Jq.LJ());
                    }
                    this.LLJJJIL = 0L;
                }
                this.LLJJJ = null;
                return;
            }
            return;
        }
        if (!this.LLJJIJI) {
            this.LLJJIJI = true;
            C653660PkS c653660PkSLJIIIZ2 = LJIIIZ();
            if (c653660PkSLJIIIZ2 != null && (function1 = c653660PkSLJIIIZ2.LJJLIIIJL) != null) {
                strInvoke2 = function1.invoke(LJII());
            }
            if (C123100dR.LIZ(strInvoke2)) {
                LJIILLIIL(C2097908Jt.LIZJ(new Pair("search_third_item_id", strInvoke2)));
            } else {
                LJIILLIIL(C2097608Jq.LJ());
            }
        }
    }

    @Override // X.C664340Q4a
    @InterfaceC1294060jmO
    public final void LJIJI(Aweme aweme, C653660PkS c653660PkS, long j) {
        ISearchContextAbility iSearchContextAbility;
        Aweme aweme2;
        int duration;
        List<PhotoModeImageUrlModel> imageList;
        if (C1833407Ga.LIZ() || aweme == null || c653660PkS == null || (iSearchContextAbility = this.LLJJIII.get()) == null) {
            return;
        }
        int i = ((C0PRC) iSearchContextAbility.Ph1().LIZJ()).LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_id", c653660PkS.LJIIJ);
        c2344009Gk.LJIIIIZZ("search_result_id", c653660PkS.LJJLI.invoke(aweme));
        c2344009Gk.LJIIIIZZ("search_keyword", c653660PkS.LJFF);
        c2344009Gk.LJIIIIZZ("enter_from", c653660PkS.LJIIIIZZ);
        String strLIZ = C0PSI.LIZ(i);
        if (strLIZ == null) {
            strLIZ = "";
        }
        c2344009Gk.LJIIIIZZ("search_type", strLIZ);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        Function1<? super Aweme, String> function1 = c653660PkS.LJJLIIIJL;
        C661490Px5 c661490Px5 = this.LL;
        if (c661490Px5 != null) {
            aweme2 = c661490Px5.LIZJ;
        } else {
            aweme2 = null;
        }
        c2344009Gk.LJIIIIZZ("list_item_id", function1.invoke(aweme2));
        c2344009Gk.LJIIIIZZ("token_type", c653660PkS.LJJII);
        int size = 0;
        c2344009Gk.LIZJ(0, "is_fullscreen");
        Video video = aweme.getVideo();
        if (video != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        c2344009Gk.LIZJ(duration, "video_duration");
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LIZLLL(j, "play_duration");
        c2344009Gk.LIZLLL(j, "post_stay_duration");
        C20684815ws.LJIILLIIL("post_stay_time", c2344009Gk.LIZ);
    }
}
