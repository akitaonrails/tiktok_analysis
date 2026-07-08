package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel;
import java.io.IOException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel$listener$1$onStop$1$trimRest$1", f = "CommentAudioRecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1352640lIs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Long>>, Object> {
    public final /* synthetic */ C458520HyU LL;
    public final /* synthetic */ CommentAudioRecordViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352640lIs(C458520HyU c458520HyU, CommentAudioRecordViewModel commentAudioRecordViewModel, InterfaceC1364105Vn<? super C1352640lIs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c458520HyU;
        this.LLILLJJLI = commentAudioRecordViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352640lIs(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws IOException {
        C1C7U.LIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1$trimRest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1352670lIv c1352670lIv = C1352670lIv.LIZ;
        Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
        C458520HyU c458520HyU = this.LL;
        String str = c458520HyU.LIZ;
        long jWQ2 = this.LLILLJJLI.wQ2(c458520HyU.LIZIZ);
        c1352670lIv.getClass();
        C1352710lIz c1352710lIz = C1352710lIz.LIZ;
        if (str == null) {
            str = "";
        }
        int i = (int) jWQ2;
        c1352710lIz.getClass();
        C0VSJ c0vsj = new C0VSJ(C1352710lIz.LJFF(applicationContext), "process");
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        String strLJ = C1352710lIz.LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJ);
        sbLIZ.append("_trimmed.wav");
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
        c0vsj2.createNewFile();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLJ);
        sbLIZ2.append("_remainder.wav");
        C0VSJ c0vsj3 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ2));
        c0vsj3.createNewFile();
        TEVideoUtils.nativeSplitVideo(str, new String[]{c0vsj2.getAbsolutePath(), c0vsj3.getAbsolutePath()}, new int[]{i}, true);
        try {
            c0vsj3.delete();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            new C0VSJ(str).delete();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Pair pair = new Pair(c0vsj2.getAbsolutePath(), Long.valueOf(jWQ2));
        C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1$trimRest$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
