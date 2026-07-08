package X;

import com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol.LiveRecordingsListHighlightItem;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.liverecordings.LiveRecordingsRepositoryImpl$fetchLiveRecordingsMediaModel$2", f = "LiveRecordingsRepositoryImpl.kt", l = {144, 147, 152, 172, 173, 175}, m = "invokeSuspend")
public final class C533540KwC extends C09AX implements Function2<InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public LiveRecordingsRepositoryImpl LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public LiveRecordingsListHighlightItem LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ LiveRecordingsRepositoryImpl LLJ;
    public final /* synthetic */ C533680KwQ LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533540KwC(boolean z, LiveRecordingsRepositoryImpl liveRecordingsRepositoryImpl, C533680KwQ c533680KwQ, int i, InterfaceC1364105Vn<? super C533540KwC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = z;
        this.LLJ = liveRecordingsRepositoryImpl;
        this.LLJI = c533680KwQ;
        this.LLJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533540KwC c533540KwC = new C533540KwC(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c533540KwC.LLIZ = obj;
        return c533540KwC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x025e, code lost:
    
        if (r2.emit(r1, r13) != r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0108, code lost:
    
        if (r2.emit(r1, r13) == r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021c, code lost:
    
        if (r14 != r3) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:9:0x002c, B:39:0x00e6], limit reached: 124 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0232 -> B:87:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0234 -> B:87:0x01c4). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C533540KwC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Pair<? extends List<? extends TikTokMediaModel>, ? extends Boolean>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
