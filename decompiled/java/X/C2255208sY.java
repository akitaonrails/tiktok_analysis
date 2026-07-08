package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08sY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.MultiMediaUploadFrameTask$decodeMultiMediaFrameFlow$1", f = "MultiMediaUploadFrameTask.kt", l = {157, 170}, m = "invokeSuspend")
public final class C2255208sY extends C09AX implements Function2<InterfaceC346701Wf<? super C2255408sa>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C2255508sb LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ LinkedHashMap<C2255508sb, List<Long>> LLIZLLLIL;
    public final /* synthetic */ C2256008sg LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2255208sY(LinkedHashMap<C2255508sb, List<Long>> linkedHashMap, C2256008sg c2256008sg, InterfaceC1364105Vn<? super C2255208sY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = linkedHashMap;
        this.LLJ = c2256008sg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2255208sY c2255208sY = new C2255208sY(this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c2255208sY.LLIZ = obj;
        return c2255208sY;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0075 -> B:7:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:8:0x002d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x011c -> B:8:0x002d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2255208sY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C2255408sa> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
