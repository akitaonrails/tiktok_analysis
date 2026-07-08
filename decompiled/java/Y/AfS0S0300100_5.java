package Y;

import X.C09JN;
import X.C0E48;
import X.C0EFJ;
import X.C1390380mHk;
import X.C1C7U;
import X.C201955140j;
import X.C201962140q;
import X.C2188811AlT;
import X.C377020EqK;
import X.C785410UrT;
import X.DialogC386800FEo;
import android.content.Context;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: loaded from: classes6.dex */
public class AfS0S0300100_5 implements C09JN {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        C1C7U.LIZ("AutoMusicTask@eaa4.doAutoMusic$4");
        C201955140j.LIZJ(C201962140q.LIZIZ, "auto music onNext");
        DialogC386800FEo dialogC386800FEo = (DialogC386800FEo) afS0S0300100_5.l0;
        dialogC386800FEo.dismiss();
        C785410UrT.LIZ(dialogC386800FEo);
        C377020EqK c377020EqK = (C377020EqK) afS0S0300100_5.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) afS0S0300100_5.l2;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS0S0300100_5.j3;
        c377020EqK.getClass();
        C377020EqK.LJ(jCurrentTimeMillis, videoPublishEditModel, true);
        C1C7U.LIZIZ("AutoMusicTask@eaa4.doAutoMusic$4");
    }

    public static final void accept$1(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        C1C7U.LIZ("AutoMusicTask@eaa4.doAutoMusic$5");
        C201962140q c201962140q = C201962140q.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("auto music onError: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C201955140j.LJII(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
        DialogC386800FEo dialogC386800FEo = (DialogC386800FEo) afS0S0300100_5.l0;
        dialogC386800FEo.dismiss();
        C785410UrT.LIZ(dialogC386800FEo);
        Context context = ((C377020EqK) afS0S0300100_5.l1).LL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131834185);
        C1390380mHk.LIZJ(context, 1074, creativeToastBuilder);
        C0EFJ c0efj = C0EFJ.LIZ;
        C0E48 c0e48 = ((C377020EqK) afS0S0300100_5.l1).LLILZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) afS0S0300100_5.l2;
        c0efj.getClass();
        C0EFJ.LIZIZ(videoPublishEditModel, c0e48, "failed");
        C377020EqK c377020EqK = (C377020EqK) afS0S0300100_5.l1;
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) afS0S0300100_5.l2;
        long jCurrentTimeMillis = System.currentTimeMillis() - afS0S0300100_5.j3;
        c377020EqK.getClass();
        C377020EqK.LJ(jCurrentTimeMillis, videoPublishEditModel2, false);
        C1C7U.LIZIZ("AutoMusicTask@eaa4.doAutoMusic$5");
    }

    public AfS0S0300100_5(DialogC386800FEo dialogC386800FEo, C377020EqK c377020EqK, VideoPublishEditModel videoPublishEditModel, long j, int i) {
        this.$t = i;
        this.l0 = dialogC386800FEo;
        this.l1 = c377020EqK;
        this.l2 = videoPublishEditModel;
        this.j3 = j;
    }
}
