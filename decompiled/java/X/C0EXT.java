package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EXT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXT implements InterfaceC366210EXj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C1664750tQH LLILLL;
    public final C1664740tQG LLILZ;
    public final C0EX2 LLILLJJLI = C0EX2.VIDEO_EFFECT;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(419));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXT.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EXT.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC366210EXj
    public final void LIZ() {
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJFF() {
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJII(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        return false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC366210EXj
    public final C0EX2 getTaskType() {
        return this.LLILLJJLI;
    }

    public C0EXT(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455500nym.class, null);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LIZJ(NLETrack nLETrack) {
        return C351220Dpo.LLJJIII(nLETrack);
    }

    @Override // X.InterfaceC366210EXj
    public final boolean LJ(C0EY3 c0ey3, C0EYD c0eyd) {
        C1664740tQG c1664740tQG = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        InterfaceC1455500nym interfaceC1455500nym = (InterfaceC1455500nym) c1664740tQG.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC1455500nym != null) {
            interfaceC1455500nym.rF1();
        }
        InterfaceC1455500nym interfaceC1455500nym2 = (InterfaceC1455500nym) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1]);
        if (interfaceC1455500nym2 != null) {
            interfaceC1455500nym2.Qh();
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZLLL(C0EXH c0exh, C0EY3 c0ey3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // X.InterfaceC366210EXj
    public final Object LJI(C0EXH c0exh, C0EY3 c0ey3, C366230EXl c366230EXl) {
        ?? arrayList;
        List listLJIILJJIL;
        C348100Dkm c348100DkmLIZIZ;
        C0EYJ c0eyjLIZLLL;
        C1664750tQH c1664750tQH = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        InterfaceC1452170ntP value = ((InterfaceC1455860nzM) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (c0eyjLIZLLL = c348100DkmLIZIZ.LIZLLL()) != null) {
            c0eyjLIZLLL.LJIIJJI(c0ey3.LIZ);
        }
        InterfaceC356850Dyt interfaceC356850DytAz1 = ((InterfaceC1446740nke) this.LLILLL.getValue(this, interfaceC2217461BqaArr[0])).az1();
        if ((interfaceC356850DytAz1 instanceof C356830Dyr) && interfaceC356850DytAz1 != null && (listLJIILJJIL = C356830Dyr.LJIILJJIL(c0ey3.LIZ)) != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJIILJJIL) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                if (C357540E0a.LJIILL(nLETrackSlot) || C351220Dpo.LLJLLL(nLETrackSlot)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel videoPublishEditModel = c0ey3.LIZIZ;
        c363500EMy.getClass();
        C0EYI.LIZ(c0ey3.LIZ, c0ey3.LIZIZ, (C0EY0) this.LLILZIL.getValue(), C2286608xc.LJ((int) (c0ey3.LIZ.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))), C363500EMy.LJ(arrayList, videoPublishEditModel));
        return Unit.LIZ;
    }

    @Override // X.InterfaceC366210EXj
    public final Object LIZIZ(C0EXH c0exh, C0EY3 c0ey3, boolean z, C366260EXo c366260EXo) {
        return C366220EXk.LIZ(this, c0exh, c0ey3, z, c366260EXo);
    }
}
