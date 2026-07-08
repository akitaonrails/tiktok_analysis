package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS3S0000200_4;
import kotlin.jvm.internal.AwS9S0100200_4;
import njp.a;

/* JADX INFO: renamed from: X.0DeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$selectMusic$1", f = "LiveHighlightViewModel.kt", l = {417}, m = "invokeSuspend")
public final class C344030DeD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveHighlightViewModel LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344030DeD(LiveHighlightViewModel liveHighlightViewModel, long j, long j2, boolean z, Context context, InterfaceC1364105Vn<? super C344030DeD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveHighlightViewModel;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = z;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C344030DeD c344030DeD = new C344030DeD(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c344030DeD.LLILLJJLI = obj;
        return c344030DeD;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v27, types: [T, java.io.File] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.selectMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                c259800zU = (C259800zU) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLL.LLILZ.put(C2286608xc.LJFF(this.LLILZ), C2286608xc.LJFF(this.LLILZIL));
            long j = this.LLILZIL;
            if (j == -1) {
                this.LLILLL.setState(new AwS3S0000200_4(this.LLILZ, j, 0));
                this.LLILLL.setState(new AwS3S0000200_4(this.LLILZ, this.LLILZIL, 1));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LiveHighlightViewModel@9d4.selectMusic$1");
                return unit;
            }
            c259800zU = new C259800zU();
            Object obj2 = ((LinkedHashMap) this.LLILLL.LLILZIL).get(C2286608xc.LJFF(this.LLILZIL));
            T t = obj2;
            if (obj2 == null) {
                t = "";
            }
            c259800zU.element = t;
            C259800zU c259800zU2 = new C259800zU();
            try {
                String str = (String) c259800zU.element;
                C844470XAv.LIZ.getClass();
                c259800zU2.element = C2114508Qd.LJFF(LIZ(C844470XAv.LIZ()), str);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            T t2 = c259800zU2.element;
            if (t2 == 0 || !((File) t2).exists()) {
                this.LLILLL.LLILZIL.put(C2286608xc.LJFF(this.LLILZIL), "");
                c259800zU.element = "";
                if (this.LLILZLL) {
                    this.LLILLL.setState(AFwS232S0000000_4.get$arr$(42));
                }
                this.LLILLL.setState(new AwS3S0000200_4(this.LLILZ, this.LLILZIL, 2));
                C1DFB c1dfb = C0PEM.LIZJ;
                C323790Cmf c323790Cmf = new C323790Cmf(c259800zU, this.LLILLL, this.LLILZIL, this.LLIZ, null);
                this.LLILLJJLI = c259800zU;
                this.LL = 1;
                if (C23250099c.LJI(this, c1dfb, c323790Cmf) == objLJFF) {
                    C1C7U.LIZIZ("LiveHighlightViewModel@9d4.selectMusic$1");
                    return objLJFF;
                }
            }
        }
        if (((CharSequence) c259800zU.element).length() <= 0) {
            z = false;
        }
        this.LLILLL.LLILZIL.put(C2286608xc.LJFF(this.LLILZIL), (String) c259800zU.element);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectMusic download status: ");
        sbLIZ.append(z);
        sbLIZ.append(", musicId: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", fragmentId: ");
        sbLIZ.append(this.LLILZ);
        C20441214yg.LIZIZ("LiveHighlightViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Long l = (Long) ((LinkedHashMap) this.LLILLL.LLILZ).get(C2286608xc.LJFF(this.LLILZ));
        long j2 = this.LLILZIL;
        if (l != null && l.longValue() == j2) {
            if (z) {
                this.LLILLL.setState(new AwS3S0000200_4(this.LLILZ, this.LLILZIL, 3));
                this.LLILLL.setState(new AwS3S0000200_4(this.LLILZ, this.LLILZIL, 4));
            } else {
                Throwable th2 = new Throwable();
                this.LLILLL.setState(new AwS3S0000200_4(this.LLILZ, this.LLILZIL, th2, 5));
                this.LLILLL.setState(new AwS9S0100200_4(this.LLILZ, this.LLILZIL, th2, 0));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.selectMusic$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
