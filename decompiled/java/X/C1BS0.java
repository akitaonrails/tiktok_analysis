package X;

import Y.ARunnableS18S0301000_34;
import Y.ARunnableS42S0400000_34;
import Y.ARunnableS6S0401000_34;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jv6.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BS0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BS0 implements InterfaceC1177250gjz {
    public final C1BSM LIZ;
    public final List<C2205251BSp> LIZIZ = new ArrayList();
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public boolean LIZLLL;

    @Override // X.InterfaceC1177250gjz
    public final C1179540gng LJFF() {
        return new C1179540gng(this.LIZ.LIZ().zoom, new C1177960gl8(this.LIZ.LIZ().target.latitude, this.LIZ.LIZ().target.longitude), this.LIZ.LIZ().tilt, this.LIZ.LIZ().bearing);
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIIJJI() {
        Iterator<C2205251BSp> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        ((ArrayList) this.LIZIZ).clear();
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIILLIIL() {
        C1BSM c1bsm = this.LIZ;
        c1bsm.getClass();
        try {
            c1bsm.LIZ.clear();
            ((ArrayList) this.LIZIZ).clear();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177250gjz
    public final float LJIJJ() {
        return this.LIZ.LIZ().zoom;
    }

    @Override // X.InterfaceC1177250gjz
    public final float LJJIIJZLJL() {
        C1BSM c1bsm = this.LIZ;
        c1bsm.getClass();
        try {
            return c1bsm.LIZ.LJJIIJZLJL();
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177250gjz
    public final C1BSO LJJIIZI() {
        return new C1BSO(this.LIZ);
    }

    @Override // X.InterfaceC1177250gjz
    public final C1165940gRk LJJIJIIJIL() {
        try {
            VisibleRegion visibleRegionLJJIJIIJIL = this.LIZ.LIZIZ().LIZ.LJJIJIIJIL();
            LatLng latLng = visibleRegionLJJIJIIJIL.nearLeft;
            C1177960gl8 c1177960gl8 = new C1177960gl8(latLng.latitude, latLng.longitude);
            LatLng latLng2 = visibleRegionLJJIJIIJIL.nearRight;
            C1177960gl8 c1177960gl82 = new C1177960gl8(latLng2.latitude, latLng2.longitude);
            LatLng latLng3 = visibleRegionLJJIJIIJIL.farLeft;
            C1177960gl8 c1177960gl83 = new C1177960gl8(latLng3.latitude, latLng3.longitude);
            LatLng latLng4 = visibleRegionLJJIJIIJIL.farRight;
            C1177960gl8 c1177960gl84 = new C1177960gl8(latLng4.latitude, latLng4.longitude);
            LatLng latLng5 = visibleRegionLJJIJIIJIL.latLngBounds.southwest;
            C1177960gl8 c1177960gl85 = new C1177960gl8(latLng5.latitude, latLng5.longitude);
            LatLng latLng6 = visibleRegionLJJIJIIJIL.latLngBounds.northeast;
            return new C1165940gRk(c1177960gl8, c1177960gl82, c1177960gl83, c1177960gl84, new C1176580giu(c1177960gl85, new C1177960gl8(latLng6.latitude, latLng6.longitude)));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177250gjz
    public final List<InterfaceC1177040gje> getMarkers() {
        return this.LIZIZ;
    }

    public C1BS0(C1BSM c1bsm) {
        this.LIZ = c1bsm;
    }

    @Override // X.InterfaceC1177250gjz
    public final void LIZ(float f) throws Throwable {
        C1BSM c1bsm = this.LIZ;
        try {
            InterfaceC2205031BRt interfaceC2205031BRt = C2204991BRp.LIZ;
            C0W3J.LJIIIZ(interfaceC2205031BRt, "CameraUpdateFactory is not initialized");
            C2204961BRm.LLLLLLZ(c1bsm, new C2204981BRo(interfaceC2205031BRt.o0(f)), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0gmd] */
    @Override // X.InterfaceC1177250gjz
    public final void LIZJ(final Function1<? super EnumC1178880gmc, Unit> function1) {
        C1BSM c1bsm = this.LIZ;
        ?? r2 = new C1BT0() { // from class: X.0gmd
            @Override // X.C1BT0
            public final void LIZ(int i) {
                EnumC1178880gmc enumC1178880gmc;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            enumC1178880gmc = EnumC1178880gmc.UNKNOWN;
                        } else {
                            enumC1178880gmc = EnumC1178880gmc.REASON_DEVELOPER_ANIMATION;
                        }
                    } else {
                        enumC1178880gmc = EnumC1178880gmc.REASON_API_ANIMATION;
                    }
                } else {
                    enumC1178880gmc = EnumC1178880gmc.REASON_GESTURE;
                }
                function1.invoke(enumC1178880gmc);
            }
        };
        c1bsm.getClass();
        try {
            c1bsm.LIZ.b(new C1BSS(r2));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BS2] */
    @Override // X.InterfaceC1177250gjz
    public final void LIZLLL(final Function1<? super C1179540gng, Unit> function1) {
        C1BSM c1bsm = this.LIZ;
        ?? r2 = new InterfaceC2205341BSy(this) { // from class: X.1BS2
            public final /* synthetic */ C1BS0 LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC2205341BSy
            public final void LIZJ() {
                function1.invoke(new C1179540gng(this.LIZIZ.LIZ.LIZ().zoom, new C1177960gl8(this.LIZIZ.LIZ.LIZ().target.latitude, this.LIZIZ.LIZ.LIZ().target.longitude), this.LIZIZ.LIZ.LIZ().tilt, this.LIZIZ.LIZ.LIZ().bearing));
            }
        };
        c1bsm.getClass();
        try {
            c1bsm.LIZ.P0(new C1BSK(r2));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BSQ] */
    @Override // X.InterfaceC1177250gjz
    public final void LJ(final AwS562S0100000_18 awS562S0100000_18) {
        C1BSM c1bsm = this.LIZ;
        ?? r2 = new C1BT1() { // from class: X.1BSQ
            @Override // X.C1BT1
            public final void LIZ() {
                awS562S0100000_18.invoke();
            }
        };
        c1bsm.getClass();
        try {
            c1bsm.LIZ.D(new BinderC2205161BSg(r2));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BSD] */
    @Override // X.InterfaceC1177250gjz
    public final void LJI(final Function0<Unit> function0) {
        C1BSM c1bsm = this.LIZ;
        ?? r2 = new C1BT2() { // from class: X.1BSD
            @Override // X.C1BT2
            public final void LIZ() {
                function0.invoke();
            }
        };
        c1bsm.getClass();
        try {
            c1bsm.LIZ.LLILL(new C1BSG(r2));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0WvL] */
    @Override // X.InterfaceC1177250gjz
    public final void LJII(final AwS597S0100000_18 awS597S0100000_18) {
        C1BSM c1bsm = this.LIZ;
        ?? r0 = new InterfaceC838760WvK() { // from class: X.0WvL
            @Override // X.InterfaceC838760WvK
            public final void LIZ(Bitmap bitmap) {
                awS597S0100000_18.invoke(bitmap);
            }
        };
        c1bsm.getClass();
        try {
            c1bsm.LIZ.c0(new BinderC838750WvJ(r0), null);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177250gjz
    public final C1177080gji LJIIJ(C1177960gl8 c1177960gl8) throws Throwable {
        Point point;
        C1BT3 c1bt3LIZIZ = this.LIZ.LIZIZ();
        LatLng latLng = new LatLng(c1177960gl8.lat, c1177960gl8.lon);
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = {latLng};
        C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11521, "com/google/android/gms/maps/Projection", "toScreenLocation", c1bt3LIZIZ, objArr, "android.graphics.Point", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11521, "com/google/android/gms/maps/Projection", "toScreenLocation", null, objArr, c1bt3LIZIZ, c0wzw, false);
            point = (Point) c0wsuLIZIZ.LIZIZ;
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            if (objArr2 != null) {
                Object obj = objArr2[0];
                if (obj != null) {
                    c1bt3LIZIZ = (C1BT3) obj;
                }
                Object obj2 = objArr2[1];
                if (obj2 != null) {
                    latLng = (LatLng) obj2;
                }
            }
            try {
                point = (Point) C0WH6.LLLIIL(c1bt3LIZIZ.LIZ.e(latLng));
                c0wst.LIZ(11521, "com/google/android/gms/maps/Projection", "toScreenLocation", point, objArr, c1bt3LIZIZ, c0wzw, true);
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        }
        return new C1177080gji(point.x, point.y);
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIILIIL(final Function1<? super InterfaceC1177040gje, Unit> function1) {
        this.LIZ.LIZLLL(new InterfaceC2205331BSx() { // from class: X.1BS3
            @Override // X.InterfaceC2205331BSx
            public final boolean LIZLLL(C2205271BSr c2205271BSr) {
                for (Object obj : (ArrayList) this.LIZ.LIZIZ) {
                    if (Intrinsics.LJFF(((C2205251BSp) obj).LIZ, c2205271BSr)) {
                        if (obj != null) {
                            function1.invoke((InterfaceC1177040gje) obj);
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
        });
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIILJJIL(boolean z) {
        C1BSM c1bsm = this.LIZ;
        c1bsm.getClass();
        try {
            c1bsm.LIZ.LLLIZZ(z);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1BTk] */
    @Override // X.InterfaceC1177250gjz
    public final C2205461BTk LJIILL(final Context context) {
        a.LIZLLL(context);
        final C1BSM c1bsm = this.LIZ;
        return new InterfaceC1177110gjl<T>(context, c1bsm) { // from class: X.1BTk
            public final Context LIZ;
            public final C1BSM LIZIZ;
            public final C2205451BTj<T> LIZJ;

            @Override // X.InterfaceC1177110gjl
            public final void LIZ() {
                this.LIZJ.LIZJ();
            }

            @Override // X.InterfaceC1177110gjl
            public final Set<InterfaceC1177120gjm<T>> LIZLLL() {
                C2205451BTj<T> c2205451BTj = this.LIZJ;
                ((HashSet) c2205451BTj.LJIIIZ).clear();
                C1BU7<T> c1bu7 = c2205451BTj.LJ;
                c1bu7.lock();
                try {
                    for (InterfaceC1177120gjm<T> interfaceC1177120gjm : c1bu7.LJI(c2205451BTj.LJI.LIZ().zoom)) {
                        ((HashSet) c2205451BTj.LJIIIZ).add(new C1178500gm0(interfaceC1177120gjm.getPosition(), interfaceC1177120gjm.getItems()));
                    }
                    c1bu7.unlock();
                    return c2205451BTj.LJIIIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1bu7.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC1177110gjl
            public final void LJIIIIZZ() {
                this.LIZJ.LJ();
            }

            @Override // X.InterfaceC1177110gjl
            public final void clearData() {
                C1BU7<T> c1bu7 = this.LIZJ.LJ;
                c1bu7.lock();
                try {
                    c1bu7.LIZIZ();
                    c1bu7.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1bu7.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC1177110gjl
            public final Collection<T> getData() {
                C1BU7<T> c1bu7 = this.LIZJ.LJ;
                c1bu7.lock();
                try {
                    Collection<T> items = c1bu7.getItems();
                    c1bu7.unlock();
                    return items;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1bu7.unlock();
                    throw th;
                }
            }

            @Override // X.InterfaceC1177110gjl
            public final void LIZIZ(final InterfaceC2205561BTu<T> interfaceC2205561BTu) {
                final Context context2 = this.LIZ;
                final C1BSM c1bsm2 = this.LIZIZ;
                final C2205451BTj<T> c2205451BTj = this.LIZJ;
                InterfaceC2205551BTt<T> interfaceC2205551BTt = new DefaultClusterRenderer<T>(context2, c1bsm2, c2205451BTj, interfaceC2205561BTu) { // from class: X.1BTr
                    public final InterfaceC2205561BTu<T> LJIJI;

                    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
                    public final boolean LJIIZILJ(InterfaceC1177120gjm<T> interfaceC1177120gjm) {
                        return this.LJIJI.LIZ(interfaceC1177120gjm);
                    }

                    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
                    public final void LJIIJJI(T t, MarkerOptions markerOptions) {
                        C1178140glQ c1178140glQ = new C1178140glQ();
                        this.LJIJI.LJI(t, c1178140glQ);
                        C1BS4.LIZ(c1178140glQ, markerOptions);
                    }

                    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
                    public final void LJIIL(InterfaceC1177120gjm<T> interfaceC1177120gjm, MarkerOptions markerOptions) {
                        C1178140glQ c1178140glQ = new C1178140glQ();
                        this.LJIJI.LIZIZ(interfaceC1177120gjm, c1178140glQ);
                        C1BS4.LIZ(c1178140glQ, markerOptions);
                    }

                    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
                    public final void LJIILIIL(T t, C2205271BSr c2205271BSr) {
                        this.LJIJI.LIZLLL(t);
                    }

                    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
                    public final void LJIILJJIL(T t, C2205271BSr c2205271BSr) {
                        this.LJIJI.LJ(t, new C2205251BSp(c2205271BSr));
                    }

                    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
                    public final void LJIILL(InterfaceC1177120gjm<T> interfaceC1177120gjm, C2205271BSr c2205271BSr) {
                        this.LJIJI.LJFF();
                    }

                    @Override // com.google.maps.android.clustering.view.DefaultClusterRenderer
                    public final void LJIILLIIL(InterfaceC1177120gjm<T> interfaceC1177120gjm, C2205271BSr c2205271BSr) {
                        this.LJIJI.LIZJ(interfaceC1177120gjm, new C2205251BSp(c2205271BSr));
                    }

                    {
                        this.LJIJI = interfaceC2205561BTu;
                    }
                };
                C2205451BTj<T> c2205451BTj2 = this.LIZJ;
                c2205451BTj2.LJFF.LIZ(null);
                c2205451BTj2.LJFF.LJIIIIZZ(null);
                c2205451BTj2.LIZJ.LIZ();
                c2205451BTj2.LIZIZ.LIZ();
                ((ArrayList) c2205451BTj2.LIZLLL).clear();
                c2205451BTj2.LJFF.LJFF();
                c2205451BTj2.LJFF = interfaceC2205551BTt;
                interfaceC2205551BTt.LJI();
                c2205451BTj2.LJFF.LIZ(c2205451BTj2.LJIIL);
                c2205451BTj2.LJFF.LIZJ();
                c2205451BTj2.LJFF.LIZLLL();
                c2205451BTj2.LJFF.LJIIIIZZ(c2205451BTj2.LJIIJJI);
                c2205451BTj2.LJFF.LJII();
                c2205451BTj2.LJFF.LJ();
                c2205451BTj2.LJ();
            }

            @Override // X.InterfaceC1177110gjl
            public final void LIZJ(InterfaceC1206010hUN<T> interfaceC1206010hUN) {
                C2205451BTj<T> c2205451BTj = this.LIZJ;
                C2205511BTp c2205511BTp = new C2205511BTp(c2205451BTj.LJ, interfaceC1206010hUN);
                c2205511BTp.lock();
                try {
                    C1BU7<T> c1bu7 = c2205451BTj.LJ;
                    c2205451BTj.LJ = c2205511BTp;
                    if (c1bu7 != null) {
                        c1bu7.lock();
                        try {
                            c2205511BTp.LIZLLL(c1bu7.getItems());
                            c1bu7.unlock();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c1bu7.unlock();
                            throw th;
                        }
                    }
                    c2205511BTp.unlock();
                    c2205451BTj.LJ.LJFF();
                    c2205451BTj.LJ();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c2205511BTp.unlock();
                    throw th2;
                }
            }

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
            @Override // X.InterfaceC1177110gjl
            public final void LJFF(final Function1<? super T, Boolean> function1) {
                C2205451BTj<T> c2205451BTj = this.LIZJ;
                C1BU6<T> c1bu6 = (C1BU6<T>) new C1BU6<T>() { // from class: X.1BTy
                    /* JADX WARN: Incorrect types in method signature: (TT;)Z */
                    @Override // X.C1BU6
                    public final boolean LIZ(C1BU1 c1bu1) {
                        return function1.invoke(c1bu1).booleanValue();
                    }
                };
                c2205451BTj.LJIIJJI = c1bu6;
                c2205451BTj.LJFF.LJIIIIZZ(c1bu6);
            }

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
            @Override // X.InterfaceC1177110gjl
            public final void LJI(final Function1<? super InterfaceC1177120gjm<T>, Boolean> function1) {
                C2205451BTj<T> c2205451BTj = this.LIZJ;
                C1BU4<T> c1bu4 = (C1BU4<T>) new C1BU4<T>() { // from class: X.1BTx
                    @Override // X.C1BU4
                    public final boolean LIZ(InterfaceC1177120gjm<T> interfaceC1177120gjm) {
                        return function1.invoke(interfaceC1177120gjm).booleanValue();
                    }
                };
                c2205451BTj.LJIIL = c1bu4;
                c2205451BTj.LJFF.LIZ(c1bu4);
            }

            @Override // X.InterfaceC1177110gjl
            public final boolean LJII(Collection<? extends T> collection) {
                C1BU7<T> c1bu7 = this.LIZJ.LJ;
                c1bu7.lock();
                try {
                    boolean zLIZLLL = c1bu7.LIZLLL(collection);
                    c1bu7.unlock();
                    return zLIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1bu7.unlock();
                    throw th;
                }
            }

            {
                this.LIZ = context;
                this.LIZIZ = c1bsm;
                this.LIZJ = new C2205451BTj<>(context, c1bsm);
            }

            @Override // X.InterfaceC1177110gjl
            public final boolean LJ(T t, T t2) {
                C1BU7<T> c1bu7 = this.LIZJ.LJ;
                c1bu7.lock();
                try {
                    boolean zLIZ = c1bu7.LIZ(t, t2);
                    c1bu7.unlock();
                    return zLIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1bu7.unlock();
                    throw th;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BSC] */
    @Override // X.InterfaceC1177250gjz
    public final void LJIIZILJ(final Function0<Unit> function0) {
        C1BSM c1bsm = this.LIZ;
        ?? r2 = new InterfaceC2205351BSz() { // from class: X.1BSC
            @Override // X.InterfaceC2205351BSz
            public final void LIZ() {
                function0.invoke();
            }
        };
        c1bsm.getClass();
        try {
            c1bsm.LIZ.c1(new C1BSI(r2));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133 A[PHI: r10
      0x0133: PHI (r10v6 com.google.android.gms.maps.model.CircleOptions) = (r10v0 com.google.android.gms.maps.model.CircleOptions), (r10v8 com.google.android.gms.maps.model.CircleOptions) binds: [B:39:0x010c, B:44:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1BS9] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // X.InterfaceC1177250gjz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1BS9 LJIJI(X.C1177600gkY r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BS0.LJIJI(X.0gkY):X.1BS9");
    }

    public final void LJJ(C2204981BRo c2204981BRo) {
        try {
            C2205091BRz c2205091BRz = C2205091BRz.LIZ;
            c2205091BRz.getClass();
            c2205091BRz.LIZJ("google_map_move_camera_crash", new C1195420hDI(false, false, null));
            C2204961BRm.LLLLLLZ(this.LIZ, c2204981BRo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2205091BRz c2205091BRz2 = C2205091BRz.LIZ;
            String simpleName = e.getClass().getSimpleName();
            c2205091BRz2.getClass();
            c2205091BRz2.LIZJ("google_map_move_camera_crash", new C1195420hDI(true, false, simpleName));
        }
    }

    @Override // X.InterfaceC1177250gjz
    public final C2205251BSp LJIIL(C1177960gl8 c1177960gl8, C1178140glQ c1178140glQ) throws Throwable {
        C1BSM c1bsm = this.LIZ;
        MarkerOptions markerOptions = new MarkerOptions();
        C2204961BRm.LLLLLZIL(markerOptions, new LatLng(c1177960gl8.lat, c1177960gl8.lon), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/F3+A==", null));
        markerOptions.zzh = c1178140glQ.LIZJ;
        markerOptions.zzm = 1.0f;
        float f = c1178140glQ.LJ;
        float f2 = c1178140glQ.LIZLLL;
        markerOptions.zze = f;
        markerOptions.zzf = f2;
        markerOptions.zzn = c1178140glQ.LJFF;
        String str = c1178140glQ.LIZIZ;
        if (str != null) {
            markerOptions.zzb = str;
        }
        Bitmap bitmap = c1178140glQ.LIZ;
        if (bitmap != null) {
            markerOptions.zzd = C1BT8.LIZ(bitmap);
        }
        C2205271BSr c2205271BSrLLLLLLLLL = C2204961BRm.LLLLLLLLL(c1bsm, markerOptions, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
        if (c2205271BSrLLLLLLLLL == null) {
            return null;
        }
        C2205251BSp c2205251BSp = new C2205251BSp(c2205271BSrLLLLLLLLL);
        ((ArrayList) this.LIZIZ).add(c2205251BSp);
        return c2205251BSp;
    }

    @Override // X.InterfaceC1177250gjz
    public final void LIZIZ(C1177960gl8 c1177960gl8, Float f, C1178480gly c1178480gly) {
        C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS42S0400000_34(f, this, c1177960gl8, c1178480gly, 5));
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIIIIZZ(int i, C1178480gly c1178480gly, C1177960gl8... c1177960gl8Arr) {
        C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS18S0301000_34(i, c1178480gly, this, c1177960gl8Arr, 1));
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIJJLI(C1177960gl8 c1177960gl8, C1177960gl8 c1177960gl82, C1178480gly c1178480gly) {
        C786410Ut5.LJJZZIII(this.LIZJ, new ARunnableS6S0401000_34(c1177960gl8, c1177960gl82, c1178480gly, this, 1));
    }

    public final void LJIL(C2204981BRo c2204981BRo, Long l, InterfaceC2205021BRs interfaceC2205021BRs) {
        try {
            C1BSM c1bsm = this.LIZ;
            c1bsm.getClass();
            try {
                c1bsm.LIZ.LJIIZILJ();
                if (l != null) {
                    long jLongValue = l.longValue();
                    C2205091BRz c2205091BRz = C2205091BRz.LIZ;
                    c2205091BRz.getClass();
                    c2205091BRz.LIZJ("google_map_move_camera_crash", new C1195420hDI(false, true, null));
                    C2204961BRm.LLLLLLLLLL(this.LIZ, c2204981BRo, (int) jLongValue, interfaceC2205021BRs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
                    l.longValue();
                    return;
                }
                C2205091BRz c2205091BRz2 = C2205091BRz.LIZ;
                c2205091BRz2.getClass();
                c2205091BRz2.LIZJ("google_map_move_camera_crash", new C1195420hDI(false, true, null));
                C2204961BRm.LLLLLLLZIL(this.LIZ, c2204981BRo, interfaceC2205021BRs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
            } catch (RemoteException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C829150Wfp(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2205091BRz c2205091BRz3 = C2205091BRz.LIZ;
            String simpleName = e2.getClass().getSimpleName();
            c2205091BRz3.getClass();
            c2205091BRz3.LIZJ("google_map_move_camera_crash", new C1195420hDI(true, true, simpleName));
            interfaceC2205021BRs.LIZLLL();
        }
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIJ(int i, int i2, int i3, int i4) {
        C1BSM c1bsm = this.LIZ;
        c1bsm.getClass();
        try {
            c1bsm.LIZ.G(i, i2, i3, i4);
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C829150Wfp(e);
        }
    }

    @Override // X.InterfaceC1177250gjz
    public final void LJIIIZ(final C1177960gl8 c1177960gl8, final C1177960gl8 c1177960gl82, final int i, final int i2, final C1178480gly c1178480gly) {
        C786410Ut5.LJJZZIII(this.LIZJ, new Runnable() { // from class: X.1BRu
            public final /* synthetic */ int LLILZIL = 0;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GoogleMapHandler@f4b9.moveCamera$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GoogleMapHandler@f4b9.moveCamera$3");
            }

            public final void LIZ() throws Throwable {
                LatLngBounds latLngBounds;
                C2204981BRo c2204981BRo;
                if (C290940Bam.LIZ()) {
                    C2204971BRn c2204971BRn = new C2204971BRn();
                    C1177960gl8 c1177960gl83 = c1177960gl8;
                    C2204971BRn c2204971BRnLLLLLLZZ = C2204961BRm.LLLLLLZZ(c2204971BRn, new LatLng(c1177960gl83.lat, c1177960gl83.lon), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null));
                    C1177960gl8 c1177960gl84 = c1177960gl82;
                    latLngBounds = C2204961BRm.LLLLLLZZ(c2204971BRnLLLLLLZZ, new LatLng(c1177960gl84.lat, c1177960gl84.lon), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null)).LIZ();
                } else {
                    latLngBounds = new LatLngBounds(new LatLng(c1177960gl82.lat, c1177960gl8.lon), new LatLng(c1177960gl8.lat, c1177960gl82.lon));
                }
                int iIntValue = i;
                int iIntValue2 = i2;
                int iIntValue3 = this.LLILZIL;
                C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOepc9HN0yDVHkdQvRCEcOY+CmR5z2qoX/E=", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {latLngBounds, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)};
                C0WZW c0wzw = new C0WZW(false, "(Lcom/google/android/gms/maps/model/LatLngBounds;III)Lcom/google/android/gms/maps/CameraUpdate;", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11523, "com/google/android/gms/maps/CameraUpdateFactory", "newLatLngBounds", C2204991BRp.class, objArr, "com.google.android.gms.maps.CameraUpdate", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11523, "com/google/android/gms/maps/CameraUpdateFactory", "newLatLngBounds", null, objArr, C2204991BRp.class, c0wzw, false);
                    c2204981BRo = (C2204981BRo) c0wsuLIZIZ.LIZIZ;
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj = objArr2[0];
                        if (obj != null) {
                            latLngBounds = (LatLngBounds) obj;
                        }
                        Object obj2 = objArr2[1];
                        if (obj2 != null) {
                            iIntValue = ((Integer) obj2).intValue();
                        }
                        Object obj3 = c0wsuLIZIZ.LIZJ[2];
                        if (obj3 != null) {
                            iIntValue2 = ((Integer) obj3).intValue();
                        }
                        Object obj4 = c0wsuLIZIZ.LIZJ[3];
                        if (obj4 != null) {
                            iIntValue3 = ((Integer) obj4).intValue();
                        }
                    }
                    try {
                        InterfaceC2205031BRt interfaceC2205031BRt = C2204991BRp.LIZ;
                        C0W3J.LJIIIZ(interfaceC2205031BRt, "CameraUpdateFactory is not initialized");
                        C2204981BRo c2204981BRo2 = new C2204981BRo(interfaceC2205031BRt.LJLJJL(latLngBounds, iIntValue, iIntValue2, iIntValue3));
                        c2204981BRo = c2204981BRo2;
                        c0wst.LIZ(11523, "com/google/android/gms/maps/CameraUpdateFactory", "newLatLngBounds", c2204981BRo2, objArr, C2204991BRp.class, c0wzw, true);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new C829150Wfp(e);
                    }
                }
                final C1178480gly c1178480gly2 = c1178480gly;
                final C1BS0 c1bs0 = this;
                InterfaceC2205021BRs interfaceC2205021BRs = new InterfaceC2205021BRs() { // from class: X.1BRy
                    /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
                    @Override // X.InterfaceC2205021BRs
                    public final void LIZLLL() {
                        ?? r0;
                        C1178480gly c1178480gly3 = c1178480gly2;
                        if (c1178480gly3 != null && (r0 = c1178480gly3.LIZJ) != 0) {
                            r0.invoke();
                        }
                        c1bs0.LIZLLL = false;
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
                    @Override // X.InterfaceC2205021BRs
                    public final void onCancel() {
                        ?? r0;
                        C1178480gly c1178480gly3 = c1178480gly2;
                        if (c1178480gly3 != null && (r0 = c1178480gly3.LIZLLL) != 0) {
                            r0.invoke();
                        }
                        c1bs0.LIZLLL = false;
                    }
                };
                if (c1178480gly2 != null) {
                    if (c1178480gly2.LIZ && (!c1bs0.LIZLLL)) {
                        c1bs0.LIZLLL = true;
                        c1bs0.LJIL(c2204981BRo, c1178480gly2.LIZIZ, interfaceC2205021BRs);
                        return;
                    } else if (c1178480gly2.LIZ && c1bs0.LIZLLL) {
                        C2205091BRz c2205091BRz = C2205091BRz.LIZ;
                        c2205091BRz.getClass();
                        c2205091BRz.LIZJ("google_map_anim_camera_recall", AFwS281S0000000_34.get$arr$(61));
                    }
                }
                c1bs0.LJJ(c2204981BRo);
            }
        });
    }
}
