package X;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: X.1BZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BZ0 {
    public final InterfaceC2433109g9 LIZ;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.09g5] */
    public /* synthetic */ C1BZ0(final C1BZ8 c1bz8) {
        final C2206891BYx c2206891BYx = new C2206891BYx(c1bz8);
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ = C1BZ2.LIZIZ(new InterfaceC2433109g9(c2206891BYx) { // from class: X.1BYz
            public final InterfaceC2433109g9 LIZ;

            {
                this.LIZ = c2206891BYx;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                Context context = ((C2206891BYx) this.LIZ).LIZ.LIZ;
                if (context != null) {
                    return new C2459309kN(context, context.getPackageName());
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
        });
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ2 = C1BZ2.LIZIZ(new InterfaceC2433109g9(c1bz8) { // from class: X.1BZ6
            public final C1BZ8 LIZ;

            {
                this.LIZ = c1bz8;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                C2457009k0 c2457009k0LIZLLL = C2457009k0.LIZLLL(this.LIZ.LIZ);
                if (c2457009k0LIZLLL != null) {
                    return c2457009k0LIZLLL;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
        });
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ3 = C1BZ2.LIZIZ(new InterfaceC2433109g9(c2206891BYx) { // from class: X.1BZ4
            public final InterfaceC2433109g9 LIZ;

            {
                this.LIZ = c2206891BYx;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                Context context = ((C2206891BYx) this.LIZ).LIZ.LIZ;
                if (context != null) {
                    return new C08TE(context);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
        });
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ4 = C1BZ2.LIZIZ(new InterfaceC2433109g9(c2206891BYx) { // from class: X.1BZ5
            public final InterfaceC2433109g9 LIZ;

            {
                this.LIZ = c2206891BYx;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                Context context = ((C2206891BYx) this.LIZ).LIZ.LIZ;
                if (context != null) {
                    return new C2121708Sx(context);
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
        });
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ5 = C1BZ2.LIZIZ(new InterfaceC2433109g9(interfaceC2433109g9LIZIZ, interfaceC2433109g9LIZIZ2, interfaceC2433109g9LIZIZ3, interfaceC2433109g9LIZIZ4) { // from class: X.09kG
            public final InterfaceC2433109g9 LIZ;
            public final InterfaceC2433109g9 LIZIZ;
            public final InterfaceC2433109g9 LIZJ;
            public final InterfaceC2433109g9 LIZLLL;

            {
                this.LIZ = interfaceC2433109g9LIZIZ;
                this.LIZIZ = interfaceC2433109g9LIZIZ2;
                this.LIZJ = interfaceC2433109g9LIZIZ3;
                this.LIZLLL = interfaceC2433109g9LIZIZ4;
            }

            @Override // X.InterfaceC2433109g9
            public final /* bridge */ /* synthetic */ Object zza() {
                return new C2458509kF((C2459309kN) this.LIZ.zza(), (C2457009k0) this.LIZIZ.zza(), (C08TE) this.LIZJ.zza(), (C2121708Sx) this.LIZLLL.zza());
            }
        });
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ6 = C1BZ2.LIZIZ(new InterfaceC2433109g9(c2206891BYx) { // from class: X.1BYw
            public final InterfaceC2433109g9 LIZ;

            {
                this.LIZ = c2206891BYx;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                String string;
                Context context = ((C2206891BYx) this.LIZ).LIZ.LIZ;
                if (context == null) {
                    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                }
                try {
                    Bundle bundle = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData;
                    if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                        return new C0VSJ(C786410Ut5.y2(context, null), string);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return null;
            }
        });
        final ?? r1 = new InterfaceC2433109g9(interfaceC2433109g9LIZIZ6) { // from class: X.09g5
            public final InterfaceC2433109g9 LIZ;

            {
                this.LIZ = interfaceC2433109g9LIZIZ6;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                File file = (File) this.LIZ.zza();
                if (file == null) {
                    return null;
                }
                C0VSJ c0vsj = new C0VSJ(file, "local_testing_config.xml");
                if (!c0vsj.exists()) {
                    return AbstractC2426109f1.LIZ;
                }
                try {
                    C0VSF c0vsf = new C0VSF(c0vsj);
                    try {
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(c0vsf);
                        final C2432609g4 c2432609g4 = new C2432609g4(xmlPullParserNewPullParser);
                        c2432609g4.LIZ("local-testing-config", new InterfaceC2433209gA() { // from class: X.09g8
                            @Override // X.InterfaceC2433209gA
                            public final void zza() {
                                final C2432609g4 c2432609g42 = c2432609g4;
                                c2432609g42.getClass();
                                c2432609g42.LIZ("split-install-errors", new InterfaceC2433209gA() { // from class: X.09g7
                                    @Override // X.InterfaceC2433209gA
                                    public final void zza() {
                                        final C2432609g4 c2432609g43 = c2432609g42;
                                        for (int i = 0; i < c2432609g43.LIZ.getAttributeCount(); i++) {
                                            if ("defaultErrorCode".equals(c2432609g43.LIZ.getAttributeName(i))) {
                                                c2432609g43.LIZIZ.LIZ = Integer.valueOf(C812880Vug.LIZ(c2432609g43.LIZ.getAttributeValue(i)));
                                            }
                                        }
                                        c2432609g43.LIZ("split-install-error", new InterfaceC2433209gA() { // from class: X.09g6
                                            @Override // X.InterfaceC2433209gA
                                            public final void zza() throws XmlPullParserException {
                                                C2432609g4 c2432609g44 = c2432609g43;
                                                String attributeValue = null;
                                                String attributeValue2 = null;
                                                for (int i2 = 0; i2 < c2432609g44.LIZ.getAttributeCount(); i2++) {
                                                    if ("module".equals(c2432609g44.LIZ.getAttributeName(i2))) {
                                                        attributeValue = c2432609g44.LIZ.getAttributeValue(i2);
                                                    }
                                                    if ("errorCode".equals(c2432609g44.LIZ.getAttributeName(i2))) {
                                                        attributeValue2 = c2432609g44.LIZ.getAttributeValue(i2);
                                                    }
                                                }
                                                if (attributeValue == null || attributeValue2 == null) {
                                                    throw new XmlPullParserException(C786410Ut5.j4("'%s' element does not contain 'module'/'errorCode' attributes.", new Object[]{"split-install-error"}), c2432609g44.LIZ, null);
                                                }
                                                C2426309f3 c2426309f3 = c2432609g44.LIZIZ;
                                                int iLIZ = C812880Vug.LIZ(attributeValue2);
                                                Map map = c2426309f3.LIZIZ;
                                                if (map == null) {
                                                    throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
                                                }
                                                map.put(attributeValue, Integer.valueOf(iLIZ));
                                                while (c2432609g44.LIZ.next() != 3) {
                                                }
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        C2426009f0 c2426009f0LIZ = c2432609g4.LIZIZ.LIZ();
                        c0vsf.close();
                        return c2426009f0LIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            c0vsf.close();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        throw th;
                    }
                } catch (IOException | RuntimeException | XmlPullParserException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2432609g4.LIZJ.LJ("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e2.getMessage());
                    return AbstractC2426109f1.LIZ;
                }
            }
        };
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ7 = C1BZ2.LIZIZ(new InterfaceC2433109g9(c2206891BYx, interfaceC2433109g9LIZIZ6, interfaceC2433109g9LIZIZ3, r1) { // from class: X.1BZ1
            public final InterfaceC2433109g9 LIZ;
            public final InterfaceC2433109g9 LIZIZ;
            public final InterfaceC2433109g9 LIZJ;
            public final InterfaceC2433109g9 LIZLLL;

            {
                this.LIZ = c2206891BYx;
                this.LIZIZ = interfaceC2433109g9LIZIZ6;
                this.LIZJ = interfaceC2433109g9LIZIZ3;
                this.LIZLLL = r1;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                Context context = ((C2206891BYx) this.LIZ).LIZ.LIZ;
                if (context != null) {
                    return new C2424609em(context, (File) this.LIZIZ.zza(), (C08TE) this.LIZJ.zza(), C1BZ2.LIZ(this.LIZLLL));
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
        });
        final InterfaceC2433109g9 interfaceC2433109g9LIZIZ8 = C1BZ2.LIZIZ(new InterfaceC2433109g9(interfaceC2433109g9LIZIZ5, interfaceC2433109g9LIZIZ7, interfaceC2433109g9LIZIZ6) { // from class: X.1BYy
            public final InterfaceC2433109g9 LIZ;
            public final InterfaceC2433109g9 LIZIZ;
            public final InterfaceC2433109g9 LIZJ;

            {
                this.LIZ = interfaceC2433109g9LIZIZ5;
                this.LIZIZ = interfaceC2433109g9LIZIZ7;
                this.LIZJ = interfaceC2433109g9LIZIZ6;
            }

            @Override // X.InterfaceC2433109g9
            public final /* bridge */ /* synthetic */ Object zza() {
                return new C1BLY(C1BZ2.LIZ(this.LIZ), C1BZ2.LIZ(this.LIZIZ), C1BZ2.LIZ(this.LIZJ)) { // from class: X.1BLZ
                    public final InterfaceC2425909ez LIZ;
                    public final InterfaceC2425909ez LIZIZ;
                    public final InterfaceC2425909ez LIZJ;

                    {
                        this.LIZ = interfaceC2425909ez;
                        this.LIZIZ = interfaceC2425909ez;
                        this.LIZJ = interfaceC2425909ez;
                    }

                    public final C1BLY LJIIIIZZ() {
                        return this.LIZJ.zza() != null ? (C1BLY) this.LIZIZ.zza() : (C1BLY) this.LIZ.zza();
                    }

                    @Override // X.C1BLY
                    public final void LIZ() {
                        LJIIIIZZ().LIZ();
                    }

                    @Override // X.C1BLY
                    public final Set<String> LJFF() {
                        return LJIIIIZZ().LJFF();
                    }

                    @Override // X.C1BLY
                    public final Set<String> LJI() {
                        return LJIIIIZZ().LJI();
                    }

                    @Override // X.C1BLY
                    public final AbstractC835450Wpz<Integer> LIZIZ(C2459809kS c2459809kS) {
                        return LJIIIIZZ().LIZIZ(c2459809kS);
                    }

                    @Override // X.C1BLY
                    public final AbstractC835450Wpz<Void> LIZJ(List<String> list) {
                        return LJIIIIZZ().LIZJ(list);
                    }

                    @Override // X.C1BLY
                    public final AbstractC835450Wpz<Void> LIZLLL(int i) {
                        return LJIIIIZZ().LIZLLL(i);
                    }

                    @Override // X.C1BLY
                    public final AbstractC835450Wpz<Void> LJII(List<String> list) {
                        return LJIIIIZZ().LJII(list);
                    }

                    @Override // X.C1BLY
                    public final boolean LJ(AbstractC2457909k9 abstractC2457909k9, Activity activity) {
                        return LJIIIIZZ().LJ(abstractC2457909k9, activity);
                    }
                };
            }
        });
        this.LIZ = C1BZ2.LIZIZ(new InterfaceC2433109g9(interfaceC2433109g9LIZIZ8) { // from class: X.1BZ7
            public final InterfaceC2433109g9 LIZ;

            {
                this.LIZ = interfaceC2433109g9LIZIZ8;
            }

            @Override // X.InterfaceC2433109g9
            public final Object zza() {
                Object objZza = this.LIZ.zza();
                if (objZza != null) {
                    return objZza;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            }
        });
    }
}
