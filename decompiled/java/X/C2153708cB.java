package X;

import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.08cB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.svc.StreamVoiceChanger$onSuccessProcess$2$1", f = "StreamVoiceChanger.kt", l = {}, m = "invokeSuspend")
public final class C2153708cB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2153708cB(String str, InterfaceC1364105Vn<? super C2153708cB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2153708cB(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        File[] fileArrListFiles;
        C1C7U.LIZ("StreamVoiceChanger@6d6a.onSuccessProcess$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19546111db c19546111db = C19546111db.LIZ;
        String str = this.LL;
        c19546111db.getClass();
        File parentFile = new C0VSJ(str).getParentFile();
        if (parentFile.exists() && parentFile.isDirectory() && (fileArrListFiles = parentFile.listFiles()) != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile() && a0.LJJIIZI(file.getName(), "_stream_1024_temp", false) && file.exists()) {
                    arrayList.add(file);
                }
            }
            for (File file2 : arrayList) {
                file2.delete();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("deleteTempFiles ");
                sbLIZ.append(file2.getName());
                sbLIZ.append(" deleted");
                C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamVoiceChanger@6d6a.onSuccessProcess$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
