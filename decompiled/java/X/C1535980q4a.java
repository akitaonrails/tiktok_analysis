package X;

import com.google.gson.k;
import com.lynx.tasm.TemplateBundle;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535980q4a {
    public static final C1535980q4a LIZ = new C1535980q4a();
    public static final C1541070qCn<AbstractC1536120q4o, C1536070q4j> LIZIZ;

    static {
        int i = 20;
        C1541070qCn<AbstractC1536120q4o, C1536070q4j> c1541070qCn = new C1541070qCn<>("js_code_cache_service", true, 600000L, Long.MAX_VALUE, EnumC1533170q03.REMOVE_ON_CONSUME, i, i, (InterfaceC1541110qCr) new InterfaceC1541110qCr<AbstractC1536120q4o, C1536070q4j>() { // from class: X.0q4b
            @Override // X.InterfaceC1541110qCr
            public final void LIZ(C1541080qCo<C1536070q4j> c1541080qCo, String str) {
            }

            @Override // X.InterfaceC1541110qCr
            public final void LIZIZ(InterfaceC1541060qCm interfaceC1541060qCm, AbstractC1541140qCu<C1536070q4j> abstractC1541140qCu, EnumC1541150qCv enumC1541150qCv) {
            }

            @Override // X.InterfaceC1541110qCr
            public final /* bridge */ /* synthetic */ AbstractC1536120q4o LIZJ(k kVar, C08AB c08ab, Map map) {
                return null;
            }

            @Override // X.InterfaceC1541110qCr
            public final boolean LIZLLL(InterfaceC1541060qCm interfaceC1541060qCm, InterfaceC1541060qCm interfaceC1541060qCm2) {
                return true;
            }

            @Override // X.InterfaceC1541110qCr
            public final void LJII(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<C1536070q4j> c1541080qCo) {
            }

            @Override // X.InterfaceC1541110qCr
            public final boolean LJI(C1541080qCo<C1536070q4j> c1541080qCo) {
                C1536080q4k c1536080q4k;
                AtomicInteger atomicInteger;
                AbstractC1541130qCt<? extends AbstractC1541130qCt<?>> abstractC1541130qCt = c1541080qCo.LJIIIZ;
                if (abstractC1541130qCt instanceof C1536080q4k) {
                    c1536080q4k = (C1536080q4k) abstractC1541130qCt;
                } else {
                    c1536080q4k = null;
                }
                if (c1536080q4k == null || ((atomicInteger = c1536080q4k.LJI) != null && atomicInteger.get() > 0)) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1541110qCr
            public final InterfaceC1541060qCm LJ(Object obj, boolean z) {
                return (AbstractC1536120q4o) obj;
            }

            @Override // X.InterfaceC1541110qCr
            public final AbstractC1541130qCt<?> LJIIIZ(InterfaceC1541060qCm interfaceC1541060qCm, C1541080qCo<C1536070q4j> c1541080qCo, AbstractC1541130qCt<?> abstractC1541130qCt) {
                return new C1536080q4k((AbstractC1536120q4o) interfaceC1541060qCm, c1541080qCo);
            }

            @Override // X.InterfaceC1541110qCr
            public final C1535940q4W LJFF(AbstractC1536120q4o abstractC1536120q4o, InterfaceC1541060qCm interfaceC1541060qCm, C1535940q4W c1535940q4W) {
                return c1535940q4W;
            }

            @Override // X.InterfaceC1541110qCr
            public final /* bridge */ /* synthetic */ void LJIIIIZZ(InterfaceC1541240qD4 interfaceC1541240qD4, C08AB c08ab, C1541080qCo c1541080qCo) {
            }
        }, 64);
        LIZIZ = c1541070qCn;
        C1535890q4R.LIZ.getClass();
        C1535890q4R.LIZJ.put("js_code_cache_service".toLowerCase(Locale.ROOT), c1541070qCn);
    }

    public static void LIZIZ(String str) {
        C1536030q4f.LIZ.getClass();
        if (str != null && str.length() != 0) {
            if (C1535630q41.LJJ > 1) {
                String stringJustDisk = C1536030q4f.LJ().getStringJustDisk("engine_version", "");
                if (stringJustDisk.length() > 0 && !Intrinsics.LJFF(str, stringJustDisk)) {
                    C08QA.LJIIZILJ(new C0VSJ(C1529330ptr.LIZ(), "js_code_cache_v2"));
                }
            }
            C1536030q4f.LJ().storeStringJustDisk("engine_version", str);
        }
    }

    public static void LIZJ(int i) {
        LIZIZ.LJII = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1536070q4j LIZ(String str, C1532710pzJ c1532710pzJ, InterfaceC1532190pyT interfaceC1532190pyT, TemplateBundle templateBundle) {
        String resourceUniqueId;
        AbstractC1536120q4o abstractC1536120q4oLIZ;
        if (interfaceC1532190pyT == null || (resourceUniqueId = interfaceC1532190pyT.getResourceUniqueId()) == null || (abstractC1536120q4oLIZ = C1536000q4c.LIZ(c1532710pzJ, str, resourceUniqueId)) == null) {
            return null;
        }
        abstractC1536120q4oLIZ.LIZ = templateBundle;
        C259800zU c259800zU = new C259800zU();
        C1541080qCo c1541080qCoLIZIZ = C1541070qCn.LIZIZ(LIZIZ, abstractC1536120q4oLIZ, str, null, new C1536150q4r(c259800zU), 12);
        if (c1541080qCoLIZIZ != null) {
            c1541080qCoLIZIZ.execute();
        }
        return (C1536070q4j) c259800zU.element;
    }

    public static void LIZLLL(String str, C1532710pzJ c1532710pzJ, InterfaceC1532190pyT interfaceC1532190pyT, TemplateBundle templateBundle) {
        String resourceUniqueId;
        AbstractC1536120q4o abstractC1536120q4oLIZ;
        if (interfaceC1532190pyT != null && (resourceUniqueId = interfaceC1532190pyT.getResourceUniqueId()) != null && (abstractC1536120q4oLIZ = C1536000q4c.LIZ(c1532710pzJ, str, resourceUniqueId)) != null) {
            abstractC1536120q4oLIZ.LIZ = templateBundle;
            C1541070qCn<AbstractC1536120q4o, C1536070q4j> c1541070qCn = LIZIZ;
            c1541070qCn.LJFF(abstractC1536120q4oLIZ, str, c1541070qCn.LJ(), null);
        }
    }
}
