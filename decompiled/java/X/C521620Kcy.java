package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerPagerAssem;
import com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.viewmodel.PcsCourseVideoPlayerVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS22S0001000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import webcast.api.game.GameDrawerCategory;
import webcast.api.smb.ListSMBCourseVideosRequest;

/* JADX INFO: renamed from: X.0Kcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521620Kcy extends AbstractC712240Rwk {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
            case 2:
                onPageScrollStateChanged$2(this, i);
                break;
            default:
                super.onPageScrollStateChanged(i);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
            case 2:
            default:
                super.onPageScrolled(i, f, i2);
                break;
            case 3:
                onPageScrolled$1(this, i, f, i2);
                break;
        }
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
            case 2:
                onPageSelected$2(this, i);
                break;
            default:
                super.onPageSelected(i);
                break;
        }
    }

    public C521620Kcy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageScrollStateChanged$0(C521620Kcy c521620Kcy, int i) {
        VideoPlayerPagerAssem videoPlayerPagerAssem = (VideoPlayerPagerAssem) c521620Kcy.l0;
        videoPlayerPagerAssem.getClass();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        videoPlayerPagerAssem.Oo(z);
        Iterator it2 = ((ArrayList) videoPlayerPagerAssem.LLJJI).iterator();
        while (it2.hasNext()) {
            ((C0JMS) it2.next()).LJJLIIIJJIZ();
        }
    }

    public static final void onPageScrollStateChanged$1(C521620Kcy c521620Kcy, int i) {
        ((C483530Ixj) c521620Kcy.l0).LIZIZ(false);
    }

    public static final void onPageScrollStateChanged$2(C521620Kcy c521620Kcy, int i) {
        ((C480390Isf) c521620Kcy.l0).LIZIZ(false);
    }

    public static final void onPageSelected$0(C521620Kcy c521620Kcy, int i) {
        long j;
        VideoPlayerPagerAssem videoPlayerPagerAssem = (VideoPlayerPagerAssem) c521620Kcy.l0;
        videoPlayerPagerAssem.LLJJIJIL = videoPlayerPagerAssem.LLJJJ;
        videoPlayerPagerAssem.LLJJJ = i;
        PcsCourseVideoPlayerVM pcsCourseVideoPlayerVMNo = videoPlayerPagerAssem.No();
        pcsCourseVideoPlayerVMNo.setState(new AwS22S0001000_7(i, 0));
        ArrayList arrayList = new ArrayList(pcsCourseVideoPlayerVMNo.getState().LLILLL);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int iMax = Math.max(0, i - 3);
        int iMin = Math.min(arrayList.size() - 1, i + 3);
        if (iMax <= iMin) {
            while (true) {
                if (((C0JMR) ListProtector.get(arrayList, iMax)).LIZJ == C0JMN.NOT_AVAILABLE) {
                    C0JMR c0jmrLIZ = C0JMR.LIZ((C0JMR) ListProtector.get(arrayList, iMax), C0JMN.FETCHING, 3);
                    ListProtector.set(arrayList, iMax, c0jmrLIZ);
                    linkedHashSet.add(Long.valueOf(c0jmrLIZ.LIZ));
                }
                if (iMax == iMin) {
                    break;
                } else {
                    iMax++;
                }
            }
        }
        if (!linkedHashSet.isEmpty()) {
            pcsCourseVideoPlayerVMNo.setState(new AwS586S0100000_7((List) arrayList, (List<GameDrawerCategory>) 264));
            C0JMO c0jmo = (C0JMO) pcsCourseVideoPlayerVMNo.LL.getValue();
            ListSMBCourseVideosRequest listSMBCourseVideosRequest = new ListSMBCourseVideosRequest();
            C0JMJ c0jmjVQ2 = pcsCourseVideoPlayerVMNo.vQ2();
            long j2 = -1;
            if (c0jmjVQ2 != null) {
                j = c0jmjVQ2.LLILLJJLI;
            } else {
                j = -1;
            }
            listSMBCourseVideosRequest.anchorId = j;
            C0JMJ c0jmjVQ22 = pcsCourseVideoPlayerVMNo.vQ2();
            if (c0jmjVQ22 != null) {
                j2 = c0jmjVQ22.LLILZ;
            }
            listSMBCourseVideosRequest.courseId = j2;
            listSMBCourseVideosRequest.videoIdList = new ArrayList(linkedHashSet);
            listSMBCourseVideosRequest.scene = 3;
            C23250099c.LIZLLL(c0jmo.LIZ, null, null, new C0JI5(c0jmo, listSMBCourseVideosRequest, new AwS586S0100000_7(pcsCourseVideoPlayerVMNo, 339), new AwS216S0300000_7((List) arrayList, (List<C0JMR>) pcsCourseVideoPlayerVMNo, (PcsCourseVideoPlayerVM) linkedHashSet, (Set<Long>) 4), null), 3);
        }
        C490760JMk c490760JMk = (C490760JMk) ((LinkedHashMap) videoPlayerPagerAssem.LLJILJILJ).get(Integer.valueOf(videoPlayerPagerAssem.LLJJJ));
        C490760JMk c490760JMk2 = (C490760JMk) ((LinkedHashMap) videoPlayerPagerAssem.LLJILJILJ).get(Integer.valueOf(videoPlayerPagerAssem.LLJJIJIL));
        if (c490760JMk2 != null) {
            c490760JMk2.N5();
        }
        if (c490760JMk != null && c490760JMk.I5()) {
            c490760JMk.L5();
            Iterator it2 = ((ArrayList) videoPlayerPagerAssem.LLJJI).iterator();
            while (it2.hasNext()) {
                ((C0JMS) it2.next()).LJJLIIIJLJLI(videoPlayerPagerAssem.LLJJIJIL, videoPlayerPagerAssem.LLJJJ, c490760JMk);
            }
            videoPlayerPagerAssem.LLJILLL = null;
            return;
        }
        videoPlayerPagerAssem.LLJILLL = new C0JMT(videoPlayerPagerAssem.LLJJJ, new AwS586S0100000_7(videoPlayerPagerAssem, 260));
    }

    public static final void onPageSelected$1(C521620Kcy c521620Kcy, int i) {
        ((C483530Ixj) c521620Kcy.l0).LIZIZ(false);
    }

    public static final void onPageSelected$2(C521620Kcy c521620Kcy, int i) {
        ((C480390Isf) c521620Kcy.l0).LIZIZ(false);
    }

    public static final void onPageScrolled$0(C521620Kcy c521620Kcy, int i, float f, int i2) {
        VideoPlayerPagerAssem videoPlayerPagerAssem;
        C490760JMk c490760JMkGo;
        Iterator it2 = ((ArrayList) ((VideoPlayerPagerAssem) c521620Kcy.l0).LLJJI).iterator();
        while (it2.hasNext()) {
            ((C0JMS) it2.next()).LJIIJ();
        }
        if (f < 1.0E-10f && (c490760JMkGo = (videoPlayerPagerAssem = (VideoPlayerPagerAssem) c521620Kcy.l0).Go()) != null) {
            Iterator it3 = ((ArrayList) videoPlayerPagerAssem.LLJJI).iterator();
            while (it3.hasNext()) {
                ((C0JMS) it3.next()).LJJLIIIJL(c490760JMkGo, i);
            }
        }
    }

    public static final void onPageScrolled$1(C521620Kcy c521620Kcy, int i, float f, int i2) {
        ((C479760Ire) c521620Kcy.l0).LIZJ(f, i);
    }
}
