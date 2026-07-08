package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.music.MediaPlayerManagerServiceImpl$replaceMusicPathIfNeed$result$1", f = "MediaPlayerManagerServiceImpl.kt", l = {131}, m = "invokeSuspend")
public final class C13042058m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MediaPlayerManagerServiceImpl LLILLL;
    public final /* synthetic */ MusicBuzModel LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13042058m(MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl, MusicBuzModel musicBuzModel, long j, String str, boolean z, boolean z2, InterfaceC1364105Vn<? super C13042058m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mediaPlayerManagerServiceImpl;
        this.LLILZ = musicBuzModel;
        this.LLILZIL = j;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13042058m c13042058m = new C13042058m(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c13042058m.LLILLJJLI = obj;
        return c13042058m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("MediaPlayerManagerServiceImpl@312d.replaceMusicPathIfNeed$result$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                MediaPlayerManagerServiceImpl mediaPlayerManagerServiceImpl = this.LLILLL;
                MusicBuzModel musicBuzModel = this.LLILZ;
                boolean z2 = this.LLIZ;
                if (this.LLIZLLLIL) {
                    z = true;
                } else {
                    z = false;
                }
                this.LL = 1;
                obj = mediaPlayerManagerServiceImpl.LJI(musicBuzModel, z2, z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MediaPlayerManagerServiceImpl@312d.replaceMusicPathIfNeed$result$1");
                    return objLJFF;
                }
            }
            c098200Yq = (Pair) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("MediaPlayerManagerServiceImpl@312d.replaceMusicPathIfNeed$result$1");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
