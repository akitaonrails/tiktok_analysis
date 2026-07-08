package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709190Rrp extends C09AY implements InterfaceC1631620sYq<VideoDescAssem, C0S5P, Boolean, Unit> {
    public C709190Rrp() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(VideoDescAssem videoDescAssem, C0S5P c0s5p, Boolean bool) {
        boolean z;
        C19EG c19egLIZ;
        String str;
        Aweme aweme;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        VideoDescAssem videoDescAssem2 = videoDescAssem;
        C0S5P c0s5p2 = c0s5p;
        boolean zBooleanValue = bool.booleanValue();
        int i = 0;
        if (!Intrinsics.LJFF(c0s5p2, C709290Rrz.LIZIZ) && !zBooleanValue) {
            z = true;
        } else {
            z = false;
        }
        if (videoDescAssem2.LLLLIIL != z) {
            videoDescAssem2.LLLLIIL = z;
            if (videoDescAssem2.LLLIIL == null) {
                ViewGroup.LayoutParams layoutParams = videoDescAssem2.LJJIJL().getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i = marginLayoutParams.bottomMargin;
                }
                videoDescAssem2.LLLIIL = Integer.valueOf(i);
            }
            Integer num = videoDescAssem2.LLLIIL;
            if (num != null) {
                int iIntValue = num.intValue();
                C0RJN c0rjnLIZIZ = videoDescAssem2.jm().LIZIZ();
                if (c0rjnLIZIZ != null) {
                    c19egLIZ = c0rjnLIZIZ.LIZ();
                } else {
                    c19egLIZ = null;
                }
                C0RF0 c0rf0 = videoDescAssem2.jm().LIZLLL;
                if (c0rf0 != null) {
                    str = c0rf0.LJIIIZ;
                } else {
                    str = null;
                }
                VideoItemParams item = videoDescAssem2.Jp().getItem();
                if (item != null) {
                    aweme = item.getAweme();
                } else {
                    aweme = null;
                }
                if (!C0RR7.LIZIZ(c19egLIZ, aweme, str)) {
                    if (z) {
                        C426750GoL.LJIIIZ(videoDescAssem2.LJJIJL(), null, null, null, Integer.valueOf(iIntValue - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 23);
                    } else {
                        C426750GoL.LJIIIZ(videoDescAssem2.LJJIJL(), null, null, null, Integer.valueOf(iIntValue), false, 23);
                    }
                }
            }
        }
        C718770SHj c718770SHj = videoDescAssem2.LLLLII;
        if (c718770SHj == null) {
            c718770SHj = null;
        }
        c718770SHj.getClass();
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        Aweme aweme2 = c718770SHj.LLLLIIL;
        boolean zLJJL = c718770SHj.LJJL();
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme2, zLJJL) && !zBooleanValue && !Intrinsics.LJFF(c718770SHj.LJJLI(), Boolean.TRUE)) {
            C0SKK c0skk = c0s5p2.LIZ;
            if (c0skk != C0SKK.TRANSLATED && c0skk != C0SKK.ORIGINAL) {
                if (c0skk == C0SKK.TRANSLATING) {
                    AnonymousClass0956 anonymousClass0956 = c718770SHj.LLLLLZL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c718770SHj.LLLLLZL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c718770SHj.LL), null, null, new C709170Rrn(c718770SHj, c0s5p2, null), 3);
                } else {
                    c718770SHj.LIZLLL(c0s5p2);
                }
            } else {
                AnonymousClass0956 anonymousClass09562 = c718770SHj.LLLLLZL;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                c718770SHj.LLLLLZL = null;
                c718770SHj.LIZLLL(c0s5p2);
            }
        }
        return Unit.LIZ;
    }
}
