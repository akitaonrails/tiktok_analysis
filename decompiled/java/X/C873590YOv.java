package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.usecase.SendMediaMessageUseCase$startSendingProcess$1", f = "SendMediaMessageUseCase.kt", l = {73}, m = "invokeSuspend")
public final class C873590YOv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC873790YPp $emitter;
    public final /* synthetic */ C873500YOm $input;
    public Object L$0;
    public int label;
    public final /* synthetic */ C873580YOu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873590YOv(C873500YOm c873500YOm, C873580YOu c873580YOu, InterfaceC873790YPp interfaceC873790YPp, InterfaceC1364105Vn<? super C873590YOv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.$input = c873500YOm;
        this.this$0 = c873580YOu;
        this.$emitter = interfaceC873790YPp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C873590YOv(this.$input, this.this$0, this.$emitter, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C873910YQb c873910YQb;
        AbstractC873650YPb abstractC873650YPb;
        String strLIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("SendMediaMessageUseCase@cd4.startSendingProcess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                c873910YQb = (C873910YQb) this.L$0;
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C873500YOm c873500YOm = this.$input;
            c873910YQb = new C873910YQb(c873500YOm.LIZLLL, 15);
            C873580YOu c873580YOu = this.this$0;
            final InterfaceC873790YPp interfaceC873790YPp = this.$emitter;
            c873580YOu.getClass();
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            c13dvLIZIZ.add(new C873600YOw(c873580YOu.LIZ, c873500YOm.LIZ.LIZ()));
            C0YHT c0yht = c873500YOm.LIZ;
            final boolean z = c873500YOm.LJFF;
            final C0Y3I c0y3i = c873500YOm.LJ;
            if (c0yht instanceof C0YP1) {
                final C0YH7 c0yh7 = c873580YOu.LIZ;
                final C0YP1 c0yp1 = (C0YP1) c0yht;
                abstractC873650YPb = new AbstractC873650YPb(c0yh7, c0yp1, z, interfaceC873790YPp) { // from class: X.0YOs
                    public final C0YH7 LIZIZ;
                    public final C0YP1 LIZJ;
                    public final boolean LIZLLL;
                    public final InterfaceC873790YPp LJ;

                    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
                    @Override // X.AbstractC873650YPb
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LIZ(X.C873910YQb r38, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r39) {
                        /*
                            Method dump skipped, instruction units count: 545
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C873560YOs.LIZ(X.0YQb, X.05Vn):java.lang.Object");
                    }

                    {
                        super("media-create-new-msg");
                        this.LIZIZ = c0yh7;
                        this.LIZJ = c0yp1;
                        this.LIZLLL = z;
                        this.LJ = interfaceC873790YPp;
                    }
                };
            } else if (c0yht instanceof C0YPU) {
                final C0YH7 c0yh72 = c873580YOu.LIZ;
                final C0YPU c0ypu = (C0YPU) c0yht;
                abstractC873650YPb = new AbstractC873650YPb(c0yh72, c0ypu, c0y3i, interfaceC873790YPp) { // from class: X.0YOy
                    public final C0YH7 LIZIZ;
                    public final C0YPU LIZJ;
                    public final C0Y3I LIZLLL;
                    public final InterfaceC873790YPp LJ;

                    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
                    @Override // X.AbstractC873650YPb
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object LIZ(X.C873910YQb r10, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r11) {
                        /*
                            Method dump skipped, instruction units count: 231
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C873620YOy.LIZ(X.0YQb, X.05Vn):java.lang.Object");
                    }

                    {
                        super("media-get-retry-msg");
                        this.LIZIZ = c0yh72;
                        this.LIZJ = c0ypu;
                        this.LIZLLL = c0y3i;
                        this.LJ = interfaceC873790YPp;
                    }
                };
            } else {
                c873580YOu.LIZ.LIZLLL().LJIIIIZZ("im-media-sending-step", "unsupported media msg provider, ABORT", null);
                this.$emitter.LIZ(new C0YQ0(null, null, new C0YPY(-1055, "unsupported MediaMsgInput.MsgProvider", null, null), C873700YPg.LIZ(this.$input.LIZ)));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SendMediaMessageUseCase@cd4.startSendingProcess$1");
                return unit;
            }
            c13dvLIZIZ.add(abstractC873650YPb);
            List<AbstractC873650YPb> list = c873500YOm.LIZIZ;
            if (list != null) {
                c13dvLIZIZ.addAll(list);
            }
            c13dvLIZIZ.add(new C873610YOx(c873580YOu.LIZ));
            final C0YH7 c0yh73 = c873580YOu.LIZ;
            final boolean z2 = c873500YOm.LJFF;
            c13dvLIZIZ.add(new AbstractC873650YPb(c0yh73, z2) { // from class: X.0YOz
                public final C0YH7 LIZIZ;
                public final boolean LIZJ;

                {
                    super("media-send-to-remote");
                    this.LIZIZ = c0yh73;
                    this.LIZJ = z2;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: all -> 0x00f0, 0YLn -> 0x00f2, TRY_LEAVE, TryCatch #5 {0YLn -> 0x00f2, all -> 0x00f0, blocks: (B:27:0x00b2, B:29:0x00b6, B:32:0x00de, B:22:0x007a, B:24:0x00ac), top: B:56:0x007a }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00de A[Catch: all -> 0x00f0, 0YLn -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #5 {0YLn -> 0x00f2, all -> 0x00f0, blocks: (B:27:0x00b2, B:29:0x00b6, B:32:0x00de, B:22:0x007a, B:24:0x00ac), top: B:56:0x007a }] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0119 A[Catch: all -> 0x0140, TryCatch #1 {all -> 0x0140, blocks: (B:12:0x0031, B:38:0x00f3, B:40:0x0119, B:41:0x0122, B:42:0x0128), top: B:51:0x001e }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0128 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #1 {all -> 0x0140, blocks: (B:12:0x0031, B:38:0x00f3, B:40:0x0119, B:41:0x0122, B:42:0x0128), top: B:51:0x001e }] */
                @Override // X.AbstractC873650YPb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object LIZ(X.C873910YQb r11, X.InterfaceC1364105Vn<? super X.InterfaceC873770YPn> r12) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 341
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C873630YOz.LIZ(X.0YQb, X.05Vn):java.lang.Object");
                }
            });
            List<? extends AbstractC873650YPb> listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
            if (listLIZ != null) {
                C873580YOu c873580YOu2 = this.this$0;
                C873500YOm c873500YOm2 = this.$input;
                this.L$0 = c873910YQb;
                this.label = 1;
                objLIZ = c873580YOu2.LIZ(listLIZ, c873910YQb, c873500YOm2, true, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("SendMediaMessageUseCase@cd4.startSendingProcess$1");
                    return objLJFF;
                }
            }
            this.$emitter.LIZ(new C0YQ0(null, null, new C0YPY(-1055, "unsupported MediaMsgInput.MsgProvider", null, null), C873700YPg.LIZ(this.$input.LIZ)));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SendMediaMessageUseCase@cd4.startSendingProcess$1");
            return unit2;
        }
        InterfaceC873740YPk interfaceC873740YPk = (InterfaceC873740YPk) objLIZ;
        C873580YOu c873580YOu3 = this.this$0;
        InterfaceC873790YPp interfaceC873790YPp2 = this.$emitter;
        C873500YOm c873500YOm3 = this.$input;
        c873580YOu3.getClass();
        C869590Y9l c869590Y9l = c873910YQb.LIZ;
        C0Y8T c0y8t = c873910YQb.LIZIZ;
        if (interfaceC873740YPk instanceof C873760YPm) {
            if (c869590Y9l != null && c0y8t != null) {
                interfaceC873790YPp2.LIZ(new C0YPL(c0y8t, c869590Y9l));
            }
        } else if (interfaceC873740YPk instanceof C873640YPa) {
            C873640YPa c873640YPa = (C873640YPa) interfaceC873740YPk;
            C0YPQ c0ypq = c873640YPa.LIZ;
            if (c0ypq instanceof C873730YPj) {
                C868780Y6i c868780Y6iLIZLLL = c873580YOu3.LIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("legacy V0 silent halt: ");
                sbLIZ.append(((C873730YPj) c873640YPa.LIZ).getMessage());
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SendMediaMessageUseCase", C2188811AlT.LIZIZ(sbLIZ), 4);
            } else {
                if (c869590Y9l == null || (strLIZ = c869590Y9l.getUuid()) == null) {
                    strLIZ = C873700YPg.LIZ(c873500YOm3.LIZ);
                }
                interfaceC873790YPp2.LIZ(new C0YQ0(c0y8t, c869590Y9l, c0ypq, strLIZ));
            }
        } else {
            throw new C1954807lC();
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SendMediaMessageUseCase@cd4.startSendingProcess$1");
        return unit3;
    }
}
