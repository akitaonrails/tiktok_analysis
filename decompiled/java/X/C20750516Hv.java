package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPAssem;
import com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPViewModel;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftAvatarAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftSlotAssem;
import com.ss.android.vesdk.VERecorder;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import xbk.f;

/* JADX INFO: renamed from: X.16Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20750516Hv extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20750516Hv(C2253731DJb c2253731DJb, int i) {
        super(4);
        this.$t = i;
        this.l0 = c2253731DJb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20750516Hv(EcPiPAssem ecPiPAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = ecPiPAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20750516Hv(LeftAvatarAssem leftAvatarAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = leftAvatarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20750516Hv(LeftSlotAssem leftSlotAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = leftSlotAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20750516Hv(f fVar, int i) {
        super(4);
        this.$t = i;
        this.l0 = fVar;
    }

    public static final Object invoke$0(C20750516Hv c20750516Hv, Object obj, Object obj2, Object obj3, Object obj4) {
        Integer num;
        Drawable drawable;
        List list = (List) obj2;
        List list2 = (List) obj3;
        Function1 function1 = (Function1) obj4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] avatarDrawables = ");
        sbLIZ.append(list);
        sbLIZ.append(", avatarResIds = ");
        sbLIZ.append(list2);
        sbLIZ.append(", singleAvatarLoadFunction = ");
        sbLIZ.append(function1);
        C19290510dT.LIZLLL("LeftAvatarAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (list != null && (drawable = (Drawable) C13LP.LJJJLL(list)) != null) {
            LeftAvatarAssem leftAvatarAssem = (LeftAvatarAssem) c20750516Hv.l0;
            leftAvatarAssem.sp(1);
            leftAvatarAssem.lp().setImageDrawable(drawable);
            leftAvatarAssem.ip().getTracker().LJIILIIL = 1;
            leftAvatarAssem.ip().getTracker().LJII = 1L;
            leftAvatarAssem.ip().getTracker().LJIIJ = 1;
        }
        if (list2 != null && (num = (Integer) C13LP.LJJJLL(list2)) != null) {
            LeftAvatarAssem leftAvatarAssem2 = (LeftAvatarAssem) c20750516Hv.l0;
            int iIntValue = num.intValue();
            leftAvatarAssem2.sp(1);
            leftAvatarAssem2.lp().setActualImageResource(iIntValue);
            leftAvatarAssem2.ip().getTracker().LJIILIIL = 1;
            leftAvatarAssem2.ip().getTracker().LJII = 1L;
            leftAvatarAssem2.ip().getTracker().LJIIJ = 1;
        }
        if (function1 != null) {
            LeftAvatarAssem leftAvatarAssem3 = (LeftAvatarAssem) c20750516Hv.l0;
            leftAvatarAssem3.sp(1);
            function1.invoke(leftAvatarAssem3.lp());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C20750516Hv c20750516Hv, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        Iterator<InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>> it2 = ((C2253731DJb) c20750516Hv.l0).LJI.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), obj3, obj4);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C20750516Hv c20750516Hv, Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        Drawable drawable = (Drawable) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[selectSubscribe] avatarRightLabelUrl = ");
        sbLIZ.append(str);
        sbLIZ.append(", avatarRightLabelDrawable = ");
        sbLIZ.append(drawable);
        sbLIZ.append(", avatarRightLabelAutoPlay = ");
        sbLIZ.append(zBooleanValue);
        C19290510dT.LIZLLL("LeftSlotAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (drawable != null) {
            C786410Ut5.LLLLJI(((LeftSlotAssem) c20750516Hv.l0).lp(), 0);
            ((LeftSlotAssem) c20750516Hv.l0).lp().setImageDrawable(drawable);
            ((LeftSlotAssem) c20750516Hv.l0).ip().getTracker().LJIILJJIL = 1;
            ((LeftSlotAssem) c20750516Hv.l0).ip().getTracker().LJIIIIZZ = 1L;
            ((LeftSlotAssem) c20750516Hv.l0).ip().getTracker().LJIIJJI = 1;
        } else if (str != null && str.length() != 0) {
            C786410Ut5.LLLLJI(((LeftSlotAssem) c20750516Hv.l0).lp(), 0);
            if (zBooleanValue) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                c1331670kl3LJIIIIZZ.LJJ(((LeftSlotAssem) c20750516Hv.l0).lp());
                c1331670kl3LJIIIIZZ.LIZLLL = true;
                ((LeftSlotAssem) c20750516Hv.l0).getClass();
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                c1331750klB.LJII = EnumC1203020hPY.OVERLAY_COLOR;
                c1331670kl3LJIIIIZZ.LJJI = c1331750klB.LIZ();
                c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIIZZ.LIZLLL("noticeTypeIcon");
                final LeftSlotAssem leftSlotAssem = (LeftSlotAssem) c20750516Hv.l0;
                c1331670kl3LJIIIIZZ.LJJJIL = new InterfaceC658750Psf() { // from class: X.15tx
                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void Ck(JSONObject jSONObject) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onImageSensibleLoaded imageMonitorData:");
                        sbLIZ2.append(jSONObject);
                        C19290510dT.LIZ("LeftSlotAssem", C2188811AlT.LIZIZ(sbLIZ2));
                        int i = 1;
                        if (!jSONObject.optBoolean("isSuccess")) {
                            i = 0;
                        }
                        leftSlotAssem.ip().getTracker().LJIILJJIL = i;
                        leftSlotAssem.ip().getTracker().LJIIIIZZ = jSONObject.optLong("duration", -1L);
                        leftSlotAssem.ip().getTracker().LJIIJJI = jSONObject.optInt("from", -1);
                    }
                };
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str));
                c1331670kl3LJIIIIZZ2.LJJ(((LeftSlotAssem) c20750516Hv.l0).lp());
                c1331670kl3LJIIIIZZ2.LIZLLL = false;
                ((LeftSlotAssem) c20750516Hv.l0).getClass();
                C1331750klB c1331750klB2 = new C1331750klB();
                c1331750klB2.LIZ = true;
                c1331750klB2.LJII = EnumC1203020hPY.OVERLAY_COLOR;
                c1331670kl3LJIIIIZZ2.LJJI = c1331750klB2.LIZ();
                c1331670kl3LJIIIIZZ2.LJIL = Bitmap.Config.ARGB_8888;
                c1331670kl3LJIIIIZZ2.LIZLLL("noticeTypeIcon");
                final LeftSlotAssem leftSlotAssem2 = (LeftSlotAssem) c20750516Hv.l0;
                c1331670kl3LJIIIIZZ2.LJJJIL = new InterfaceC658750Psf() { // from class: X.15ty
                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z, String str2, JSONObject jSONObject) {
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void Ck(JSONObject jSONObject) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onImageSensibleLoaded imageMonitorData:");
                        sbLIZ2.append(jSONObject);
                        C19290510dT.LIZ("LeftSlotAssem", C2188811AlT.LIZIZ(sbLIZ2));
                        int i = 1;
                        if (!jSONObject.optBoolean("isSuccess")) {
                            i = 0;
                        }
                        leftSlotAssem2.ip().getTracker().LJIILJJIL = i;
                        leftSlotAssem2.ip().getTracker().LJIIIIZZ = jSONObject.optLong("duration", -1L);
                        leftSlotAssem2.ip().getTracker().LJIIJJI = jSONObject.optInt("from", -1);
                    }
                };
                C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
            }
        } else {
            C786410Ut5.LLLLJI(((LeftSlotAssem) c20750516Hv.l0).lp(), 8);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C20750516Hv c20750516Hv, Object obj, Object obj2, Object obj3, Object obj4) {
        SurfaceView surfaceView;
        SurfaceHolder holder;
        Surface surface;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj4).booleanValue();
        if (!zBooleanValue && zBooleanValue2 && zBooleanValue3 && (surfaceView = ((EcPiPAssem) c20750516Hv.l0).LLJ) != null && (holder = surfaceView.getHolder()) != null && (surface = holder.getSurface()) != null) {
            EcPiPViewModel ecPiPViewModelGo = ((EcPiPAssem) c20750516Hv.l0).Go();
            WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
            InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
            if (interfaceC1508380pM4LIZ != null) {
                interfaceC1508380pM4LIZ.setSurface(surface);
                if (ecPiPViewModelGo.getState().LL && interfaceC1508380pM4LIZ.isPlaying()) {
                    interfaceC1508380pM4LIZ.LJIILLIIL();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C20750516Hv c20750516Hv, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        if (!((f) c20750516Hv.l0).LLIZ.invoke().booleanValue()) {
            Iterator<InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit>> it2 = ((f) c20750516Hv.l0).LLJJ.iterator();
            while (it2.hasNext()) {
                it2.next().invoke(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), obj3, obj4);
            }
        }
        return Unit.LIZ;
    }
}
