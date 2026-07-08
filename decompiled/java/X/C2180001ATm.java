package X;

import com.ss.android.vesdk.VERecordMode;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1ATm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.livephoto.BaseLivePhotoComponent$startRecordLivePhoto$2", f = "BaseLivePhotoComponent.kt", l = {172, 201}, m = "invokeSuspend")
public final class C2180001ATm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC2180011ATn<T> LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180001ATm(AbstractC2180011ATn<T> abstractC2180011ATn, float f, InterfaceC1364105Vn<? super C2180001ATm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC2180011ATn;
        this.LLILZ = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2180001ATm c2180001ATm = new C2180001ATm(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c2180001ATm.LLILLJJLI = obj;
        return c2180001ATm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseLivePhotoComponent@401f.startRecordLivePhoto$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C2180021ATo c2180021ATo = this.LLILLL.LLIZ;
                    final EnumC2180071ATt enumC2180071ATt = (EnumC2180071ATt) c2180021ATo.LIZJ.LIZJ();
                    c2180021ATo.LIZ(new C1AU3(enumC2180071ATt) { // from class: X.1AU0
                        @Override // X.C1AU3
                        public final EnumC2180071ATt LIZ() {
                            return C2180121ATy.LIZ[this.LIZ.ordinal()] == 1 ? EnumC2180071ATt.LIVE_PHOTO_RECORDING : this.LIZ;
                        }
                    });
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BaseLivePhotoComponent@401f.startRecordLivePhoto$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLL.LLILZLL.LIZIZ.LJJJ.LIZIZ();
            this.LLILLL.LLILZLL.LIZIZ(VERecordMode.MOTION_PHOTO);
            AbstractC2180011ATn<T> abstractC2180011ATn = this.LLILLL;
            VERecorder vERecorder = abstractC2180011ATn.LLILZLL;
            VEVideoEncodeSettings vEVideoEncodeSettings = vERecorder.LIZIZ.LJIIIIZZ;
            if (vEVideoEncodeSettings == null) {
                vERecorder.LIZLLL(abstractC2180011ATn.LLJJI);
                final AbstractC2180011ATn<T> abstractC2180011ATn2 = this.LLILLL;
                final float f = this.LLILZ;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                if (abstractC2180011ATn2.getCameraApiComponent().St2().getMediaController().m5()) {
                    C2219091BtD.LIZLLL().i("livephoto startRecording but is pre playing wait for preplay stop");
                    abstractC2180011ATn2.getCameraApiComponent().St2().getMediaController().F5().observe(abstractC2180011ATn2, new InterfaceC1441305kZ<Boolean>(abstractC2180011ATn2, f, c23260099m) { // from class: X.1ATl
                        public final /* synthetic */ AbstractC2180011ATn<T> LLILLJJLI;
                        public final /* synthetic */ InterfaceC1364105Vn<Unit> LLILLL;

                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("livephoto startRecording StopPrePlayState:");
                            sbLIZ.append(zBooleanValue);
                            interfaceC1463990oCTLIZLLL.i(C2188811AlT.LIZIZ(sbLIZ));
                            if (zBooleanValue) {
                                if (!C2296808zG.LJI(this.LL)) {
                                    this.LLILLJJLI.getCameraApiComponent().St2().getMediaController().F5().removeObserver(this);
                                } else {
                                    this.LLILLJJLI.getClass();
                                    throw null;
                                }
                            }
                        }

                        {
                            this.LLILLL = c23260099m;
                        }
                    });
                } else if (C2296808zG.LJI(interfaceC497601wk)) {
                    throw null;
                }
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("BaseLivePhotoComponent@401f.startRecordLivePhoto$2");
                    return objLJFF;
                }
            } else {
                new C1780100wQK(vEVideoEncodeSettings);
                this.LLILLL.getClass();
                throw null;
            }
        }
        this.LLILLL.getClass();
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
