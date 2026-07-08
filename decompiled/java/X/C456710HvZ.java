package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.camerabtn.DefaultCameraAndAlbumButtonAbility$getCameraBtnState$1$3", f = "CameraInputVM.kt", l = {}, m = "invokeSuspend")
public final class C456710HvZ extends C09AX implements InterfaceC1685420txc<C0IBF, Boolean, Boolean, AbstractC456780Hvg, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ C0IBF LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public /* synthetic */ AbstractC456780Hvg LLILZ;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC456750Hvd> LLILZIL;
    public final /* synthetic */ C456720Hva LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456710HvZ(C456720Hva c456720Hva, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC332260D0u interfaceC332260D0u) {
        super(5, interfaceC1364105Vn);
        this.LLILZIL = interfaceC332260D0u;
        this.LLILZLL = c456720Hva;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC456750Hvd interfaceC456750Hvd;
        C1C7U.LIZ("DefaultCameraAndAlbumButtonAbility@4f12.getCameraBtnState$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0IBF c0ibf = this.LL;
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        AbstractC456780Hvg abstractC456780Hvg = this.LLILZ;
        if (z2) {
            this.LLILZIL.setValue(new InterfaceC456750Hvd() { // from class: X.0Hvi
            });
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getCameraBtnState$1$3");
            return unit;
        }
        int i = C456700HvY.LIZ[c0ibf.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    this.LLILZIL.setValue(C456820Hvk.LIZ);
                } else if (abstractC456780Hvg instanceof C456920Hvu) {
                    InterfaceC332260D0u<InterfaceC456750Hvd> interfaceC332260D0u = this.LLILZIL;
                    C456920Hvu c456920Hvu = (C456920Hvu) abstractC456780Hvg;
                    final Effect effect = c456920Hvu.LIZIZ;
                    final File file = c456920Hvu.LIZJ;
                    interfaceC332260D0u.setValue(new InterfaceC456750Hvd(effect, file) { // from class: X.0Hve
                        public final Effect LIZ;
                        public final File LIZIZ;

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("EffectCamera(effect=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", effectFile=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        public final int hashCode() {
                            return this.LIZIZ.hashCode() + this.LIZ.getEffect_id().hashCode();
                        }

                        public final boolean equals(Object obj2) {
                            if (!(obj2 instanceof C456760Hve)) {
                                return false;
                            }
                            C456760Hve c456760Hve = (C456760Hve) obj2;
                            if (!Intrinsics.LJFF(this.LIZIZ, c456760Hve.LIZIZ)) {
                                return false;
                            }
                            return Intrinsics.LJFF(this.LIZ.getEffect_id(), c456760Hve.LIZ.getEffect_id());
                        }

                        {
                            this.LIZ = effect;
                            this.LIZIZ = file;
                        }
                    });
                } else {
                    InterfaceC332260D0u<InterfaceC456750Hvd> interfaceC332260D0u2 = this.LLILZIL;
                    if (this.LLILZLL.LIZIZ.aW()) {
                        this.LLILZLL.getClass();
                        int i2 = C456740Hvc.LIZ[c0ibf.ordinal()];
                        if (i2 != 1 && i2 != 2) {
                            if (i2 != 3 && i2 != 4) {
                                throw new C1954807lC();
                            }
                            interfaceC456750Hvd = new InterfaceC456750Hvd() { // from class: X.0Hvj
                            };
                            interfaceC332260D0u2.setValue(interfaceC456750Hvd);
                        } else {
                            interfaceC456750Hvd = new InterfaceC456750Hvd() { // from class: X.0Hvl
                            };
                            interfaceC332260D0u2.setValue(interfaceC456750Hvd);
                        }
                    } else {
                        interfaceC456750Hvd = new InterfaceC456750Hvd() { // from class: X.0Hvj
                        };
                        interfaceC332260D0u2.setValue(interfaceC456750Hvd);
                    }
                }
            } else {
                this.LLILZIL.setValue(new InterfaceC456750Hvd() { // from class: X.0Hvh
                });
            }
        } else {
            this.LLILZIL.setValue(new InterfaceC456750Hvd() { // from class: X.0Hvi
            });
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getCameraBtnState$1$3");
        return unit2;
    }

    @Override // X.InterfaceC1685420txc
    public final Object invoke(C0IBF c0ibf, Boolean bool, Boolean bool2, AbstractC456780Hvg abstractC456780Hvg, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        InterfaceC332260D0u<InterfaceC456750Hvd> interfaceC332260D0u = this.LLILZIL;
        C456710HvZ c456710HvZ = new C456710HvZ(this.LLILZLL, interfaceC1364105Vn, interfaceC332260D0u);
        c456710HvZ.LL = c0ibf;
        c456710HvZ.LLILLJJLI = zBooleanValue;
        c456710HvZ.LLILLL = zBooleanValue2;
        c456710HvZ.LLILZ = abstractC456780Hvg;
        return c456710HvZ.invokeSuspend(Unit.LIZ);
    }
}
