package Y;

import X.C11VU;
import X.C1446620nkS;
import X.C1447610nm3;
import X.C19EG;
import X.C277630AuP;
import X.C810303En;
import X.InterfaceC1447630nm5;
import X.InterfaceC1452170ntP;
import X.InterfaceC1457180o1U;
import X.InterfaceC741260T5w;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.MvEffectVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.ss.android.vesdk.VEEditor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: loaded from: classes23.dex */
public class AObjectS295S0200000_22 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS295S0200000_22 aObjectS295S0200000_22) {
        return Boolean.valueOf(!o.LJIILJJIL.LIZIZ((C19EG) aObjectS295S0200000_22.l0, (PublishModel) aObjectS295S0200000_22.l1));
    }

    public static final Object invoke$1(AObjectS295S0200000_22 aObjectS295S0200000_22) {
        int measuredWidth;
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        InterfaceC1447630nm5 vEVideoCoverGeneratorImpl;
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) aObjectS295S0200000_22.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObjectS295S0200000_22.l1;
        if (vEChooseVideoCoverFragment.LLJLL.LLFII() != null) {
            if (vEChooseVideoCoverFragment.LLILLJJLI.getMeasuredWidth() != 0) {
                measuredWidth = (int) ((vEChooseVideoCoverFragment.LLILLJJLI.getMeasuredWidth() / C11VU.LIZ(44.0f)) + 0.5f);
            } else {
                measuredWidth = 7;
            }
            vEChooseVideoCoverFragment.LLLFZ = measuredWidth;
            vEChooseVideoCoverFragment.LLILLJJLI.setItemCount(measuredWidth);
            if (C1446620nkS.LIZ()) {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
            } else {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
            }
            if ((!videoPublishEditModel.isMvThemeVideoType() || ((Boolean) C277630AuP.LIZ.getValue()).booleanValue()) && !vEChooseVideoCoverFragment.LLJZIJLIL) {
                if (videoPublishEditModel.isMultiVideoEdit() && vEChooseVideoCoverFragment.LLJLL.LLFII() != null) {
                    vEVideoCoverGeneratorImpl = new VEMultiEditVideoCoverGeneratorImpl(vEChooseVideoCoverFragment.LLJLL.LLFII(), vEChooseVideoCoverFragment, vEChooseVideoCoverFragment.LLILLJJLI.getCoverSize(), vEChooseVideoCoverFragment.LLJLL.LLFII().getDuration(), 0, get_frames_flags);
                } else if (vEChooseVideoCoverFragment.LLJLL.LLFII() != null) {
                    InterfaceC1452170ntP interfaceC1452170ntPLLFII = vEChooseVideoCoverFragment.LLJLL.LLFII();
                    int coverSize = vEChooseVideoCoverFragment.LLILLJJLI.getCoverSize();
                    vEChooseVideoCoverFragment = vEChooseVideoCoverFragment;
                    vEVideoCoverGeneratorImpl = new VEVideoCoverGeneratorImpl(interfaceC1452170ntPLLFII, vEChooseVideoCoverFragment, coverSize, get_frames_flags, "choose_cover");
                } else {
                    vEVideoCoverGeneratorImpl = null;
                }
            } else {
                if (vEChooseVideoCoverFragment.LLJLL.LLFII() != null) {
                    vEChooseVideoCoverFragment.LLJLL.LLFII().getDuration();
                }
                vEVideoCoverGeneratorImpl = new MvEffectVideoCoverGeneratorImpl();
            }
            vEChooseVideoCoverFragment.LLJL = vEVideoCoverGeneratorImpl;
            vEChooseVideoCoverFragment.RR((videoPublishEditModel.getVideoCoverStartTm() * 1000.0f) / vEChooseVideoCoverFragment.LLJLL.LLFII().getDuration());
            int measuredHeight = vEChooseVideoCoverFragment.LLILLJJLI.getMeasuredHeight();
            int oneThumbWidth = (int) vEChooseVideoCoverFragment.LLILLJJLI.getOneThumbWidth();
            vEChooseVideoCoverFragment.LLILLJJLI.LLILZIL.LIZ(oneThumbWidth, measuredHeight);
            if ((!videoPublishEditModel.isMvThemeVideoType() || ((Boolean) C277630AuP.LIZ.getValue()).booleanValue()) && !vEChooseVideoCoverFragment.LLJZIJLIL) {
                InterfaceC1447630nm5 interfaceC1447630nm5 = vEChooseVideoCoverFragment.LLJL;
                if (interfaceC1447630nm5 != null) {
                    vEChooseVideoCoverFragment.LLILLJJLI.setAdapter(new C1447610nm3(interfaceC1447630nm5, oneThumbWidth, measuredHeight, 1));
                }
            } else {
                final C810303En c810303En = new C810303En(oneThumbWidth, measuredHeight);
                vEChooseVideoCoverFragment.LLILLJJLI.setAdapter(c810303En);
                MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = new MvChooseCoverBitmapCreator();
                mvChooseCoverBitmapCreator.setMvThemeVideoCoverErrorListener(new InterfaceC1457180o1U() { // from class: X.0nlP
                    @Override // X.InterfaceC1457180o1U
                    public final void onError(int i, String str) {
                        C201955140j.LJ(str);
                    }
                });
                mvChooseCoverBitmapCreator.setNeedCompileFrame(true);
                mvChooseCoverBitmapCreator.setImgSize(oneThumbWidth, measuredHeight);
                mvChooseCoverBitmapCreator.setFirstFrameBitmapLiveData(vEChooseVideoCoverFragment.LLLF);
                mvChooseCoverBitmapCreator.setFirstFrameVisibleLiveData(vEChooseVideoCoverFragment.LLLFF);
                mvChooseCoverBitmapCreator.getBitmapList(vEChooseVideoCoverFragment.getActivity(), vEChooseVideoCoverFragment.LLJLL.LLFII(), vEChooseVideoCoverFragment.LLLFZ, new InterfaceC741260T5w() { // from class: X.03Es
                    @Override // X.InterfaceC741260T5w
                    public final void LIZ(List list) {
                        C810303En c810303En2 = c810303En;
                        c810303En2.getClass();
                        if (list != null && !list.isEmpty()) {
                            ((ArrayList) c810303En2.LLILLL).clear();
                            ((ArrayList) c810303En2.LLILLL).addAll(list);
                            c810303En2.notifyDataSetChanged();
                        }
                    }
                });
                return null;
            }
        }
        return null;
    }

    public AObjectS295S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
