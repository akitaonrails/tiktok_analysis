package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.ImageModeUtils$processDataForImageMode$1", f = "ImageModeUtils.kt", l = {97, 126}, m = "invokeSuspend")
public final class C23238098q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C013C LLILLL;
    public C013C LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C2488309p3 LLIZLLLIL;
    public final /* synthetic */ ArrayList<MediaModel> LLJ;
    public final /* synthetic */ File LLJI;
    public final /* synthetic */ Set<String> LLJIJIL;
    public final /* synthetic */ ArrayList<AnonymousClass0957<Object>> LLJILJIL;
    public final /* synthetic */ ConcurrentHashMap<String, MediaModel> LLJILJILJ;
    public final /* synthetic */ CopyOnWriteArrayList<String> LLJILLL;
    public final /* synthetic */ Function1<ArrayList<MediaModel>, Unit> LLJJ;
    public final /* synthetic */ long LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C23238098q(boolean z, C2488309p3 c2488309p3, ArrayList<MediaModel> arrayList, File file, Set<String> set, ArrayList<AnonymousClass0957<Object>> arrayList2, ConcurrentHashMap<String, MediaModel> concurrentHashMap, CopyOnWriteArrayList<String> copyOnWriteArrayList, Function1<? super ArrayList<MediaModel>, Unit> function1, long j, InterfaceC1364105Vn<? super C23238098q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = z;
        this.LLIZLLLIL = c2488309p3;
        this.LLJ = arrayList;
        this.LLJI = file;
        this.LLJIJIL = set;
        this.LLJILJIL = arrayList2;
        this.LLJILJILJ = concurrentHashMap;
        this.LLJILLL = copyOnWriteArrayList;
        this.LLJJ = function1;
        this.LLJJI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23238098q c23238098q = new C23238098q(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
        c23238098q.LLILZLL = obj;
        return c23238098q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23238098q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
