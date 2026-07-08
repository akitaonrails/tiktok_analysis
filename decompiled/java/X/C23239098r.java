package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.ImageModeUtils$processDataForImageMode$1$2", f = "ImageModeUtils.kt", l = {}, m = "invokeSuspend")
public final class C23239098r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MediaModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CopyOnWriteArrayList<String> LLILLL;
    public final /* synthetic */ ConcurrentHashMap<String, MediaModel> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ ConcurrentHashMap<Integer, Pair<MediaModel, String>> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ ConcurrentHashMap<MediaModel, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23239098r(MediaModel mediaModel, String str, CopyOnWriteArrayList<String> copyOnWriteArrayList, ConcurrentHashMap<String, MediaModel> concurrentHashMap, String str2, boolean z, ConcurrentHashMap<Integer, Pair<MediaModel, String>> concurrentHashMap2, int i, ConcurrentHashMap<MediaModel, String> concurrentHashMap3, InterfaceC1364105Vn<? super C23239098r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mediaModel;
        this.LLILLJJLI = str;
        this.LLILLL = copyOnWriteArrayList;
        this.LLILZ = concurrentHashMap;
        this.LLILZIL = str2;
        this.LLILZLL = z;
        this.LLIZ = concurrentHashMap2;
        this.LLIZLLLIL = i;
        this.LLJ = concurrentHashMap3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23239098r(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageModeUtils@9f6e.processDataForImageMode$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C2488709p7.LIZ.LJIIJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL)) {
            if (this.LLILZLL) {
                this.LLIZ.put(C2286608xc.LJ(this.LLIZLLLIL), new Pair<>(this.LL, this.LLILLJJLI));
            } else {
                this.LLJ.put(this.LL, this.LLILLJJLI);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageModeUtils@9f6e.processDataForImageMode$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
