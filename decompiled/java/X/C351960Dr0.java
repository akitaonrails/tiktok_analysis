package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Dr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandlerKt$splitRecordAudioIfNeeded$2", f = "DraftCreativeRestoreHandler.kt", l = {}, m = "invokeSuspend")
public final class C351960Dr0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NLEEditor LL;
    public final /* synthetic */ AudioRecorderParam LLILLJJLI;
    public final /* synthetic */ C352220DrQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351960Dr0(NLEEditor nLEEditor, AudioRecorderParam audioRecorderParam, C352220DrQ c352220DrQ, InterfaceC1364105Vn<? super C351960Dr0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nLEEditor;
        this.LLILLJJLI = audioRecorderParam;
        this.LLILLL = c352220DrQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C351960Dr0(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftCreativeRestoreHandlerKt@2d4.splitRecordAudioIfNeeded$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VecNLETrackSPtr tracks = this.LL.getModel().getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() == NLETrackType.AUDIO && Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB")) {
                arrayList.add(nLETrack);
            }
        }
        NLEEditor nLEEditor = this.LL;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nLEEditor.getModel().removeTrack((NLETrack) it2.next());
        }
        Stack<Point> mStack = this.LLILLJJLI.getMStack();
        AudioRecorderParam audioRecorderParam = this.LLILLJJLI;
        C352220DrQ c352220DrQ = this.LLILLL;
        NLEEditor nLEEditor2 = this.LL;
        int i = 0;
        for (Object obj2 : mStack) {
            int i2 = i + 1;
            if (i >= 0) {
                Point point = (Point) obj2;
                String strLIZJ = C349310Dmj.LIZJ(audioRecorderParam.getAudioUrl(), point, c352220DrQ);
                if (strLIZJ.length() != 0) {
                    NLETrack nLETrackLIZIZ = C349310Dmj.LIZIZ(nLEEditor2.getModel());
                    NLETrackSlot nLETrackSlotLIZ = C349310Dmj.LIZ(new C349320Dmk(point, strLIZJ), i);
                    nLETrackLIZIZ.addSlot(nLETrackSlotLIZ);
                    C349300Dmi.LIZJ(nLEEditor2.getModel()).addSlot(NLETrackSlot.dynamicCast(nLETrackSlotLIZ.deepClone(true)));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.splitRecordAudioIfNeeded$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
