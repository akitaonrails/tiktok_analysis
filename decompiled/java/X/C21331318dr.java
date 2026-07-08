package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18dr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21331318dr extends C21332218e0 {
    public final C21331418ds i;
    public boolean j;
    public long k;
    public long l;
    public InterfaceC1547330qMt m;
    public InterfaceC1547330qMt n;
    public C21331518dt o;

    public final boolean LLIIJLIL() {
        return (LJJJJLI() ^ true) && this.k > 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.18ds] */
    public C21331318dr(final C21325918cz c21325918cz) {
        super(c21325918cz);
        this.i = new InterfaceC21331618du() { // from class: X.18ds
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
            /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r2v7, types: [android.view.View] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC21331618du
            public final void LIZIZ() {
                ?? r0 = c21325918cz.LIZ.LJJJLL;
                if (r0 == 0 || !((Boolean) r0.invoke()).booleanValue()) {
                    return;
                }
                C21331318dr c21331318dr = this;
                InterfaceC1547330qMt interfaceC1547330qMt = c21331318dr.m;
                if (interfaceC1547330qMt != null && c21331318dr.LLIIJLIL()) {
                    c21331318dr.LL.LJ(interfaceC1547330qMt, c21331318dr.getView(), c21331318dr.LIZJ(), null);
                }
                c21325918cz.LJIIJ.LJI = true;
                boolean z = this.j;
                C21331318dr c21331318dr2 = this;
                c21331318dr2.LJIILJJIL(c21331318dr2.LIZJ(), new C21329718db());
                C1488470opx c1488470opx = c21325918cz.LIZ.LIZJ.LIZLLL;
                long jCurrentTimeMillis = System.currentTimeMillis() - (C1337850kv1.LJII(0L, c1488470opx != null ? c1488470opx.LIZIZ("myna_server_time") : null) * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                C21331318dr c21331318dr3 = this;
                if (jCurrentTimeMillis >= c21331318dr3.k || c21331318dr3.j) {
                    C21331518dt c21331518dt = c21331318dr3.o;
                    if (c21331518dt != null) {
                        c21331518dt.LIZLLL(c21331318dr3.i);
                    }
                    if (z || !this.LLIIJLIL()) {
                        return;
                    }
                    C21331318dr c21331318dr4 = this;
                    c21331318dr4.j = true;
                    InterfaceC1547330qMt interfaceC1547330qMt2 = c21331318dr4.n;
                    if (interfaceC1547330qMt2 != null) {
                        c21331318dr4.LL.LJ(interfaceC1547330qMt2, c21331318dr4.getView(), c21331318dr4.LIZJ(), null);
                    }
                }
            }
        };
        this.l = 1000L;
    }

    @Override // X.C21332218e0, X.AbstractC21333318eB
    public final /* bridge */ /* synthetic */ void LJJJLIIL(View view) {
        LJJJLIIL((C21327618dG) view);
    }

    @Override // X.C21332218e0, X.AbstractC21333318eB
    public final /* bridge */ /* synthetic */ View LJJJLZIJ(Context context) {
        return LJJJLZIJ(context);
    }

    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJ(Map<String, ? extends Object> map) {
        this.m = C1547350qMv.LIZ(map.get("bind_tick"));
        this.n = C1547350qMv.LIZ(map.get("bind_tick_finish"));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
    @Override // X.C21332218e0, X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        boolean z;
        long j = this.l;
        loop0: while (true) {
            z = false;
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                int iHashCode = key.hashCode();
                if (iHashCode != -673660814) {
                    if (iHashCode != 503634520) {
                        if (iHashCode == 570418373 && key.equals("interval")) {
                            long jLIZIZ = (long) C1337850kv1.LIZIZ(1000.0f, entry.getValue());
                            this.l = jLIZIZ;
                            if (j != jLIZIZ) {
                                z = true;
                            }
                        }
                    } else if (key.equals("deadline")) {
                        this.k = C1337850kv1.LJII(0L, entry.getValue());
                    }
                } else if (key.equals("finished")) {
                    this.j = C1337850kv1.LIZ(entry.getValue());
                }
            }
        }
        C21331518dt c21331518dt = this.o;
        if (c21331518dt == null) {
            this.o = this.LL.LIZ.LJFF(this.l);
        } else if (z) {
            c21331518dt.LIZLLL(this.i);
            this.o = this.LL.LIZ.LJFF(this.l);
        }
        if (!this.j && getView().isAttachedToWindow() && LLIIJLIL()) {
            C21331518dt c21331518dt2 = this.o;
            if (c21331518dt2 == null) {
                C1325860kbg.LIZIZ(null, new AwS576S0100000_32(this, 455), C2097608Jq.LJ());
            } else {
                c21331518dt2.LIZIZ(this.i);
            }
        }
    }

    @Override // X.C21332218e0
    /* JADX INFO: renamed from: LLIIIZ */
    public final void LJJJLIIL(C21327618dG c21327618dG) {
        super.LJJJLIIL(c21327618dG);
        c21327618dG.LLILZ = this.LL.LIZ.LJJIJ;
        c21327618dG.addOnAttachStateChangeListener(new C19LX(this, 0));
    }

    @Override // X.C21332218e0
    /* JADX INFO: renamed from: LLIIJI */
    public final C21327618dG LJJJLZIJ(final Context context) {
        return new C21327618dG(context) { // from class: X.18cv
        };
    }
}
