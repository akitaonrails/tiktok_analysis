package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSharedBgFlickConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.effect.LiveEffectOld;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS55S1300000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938970aXf {
    public static final C098J<String, C915860ZwO> LJIIIIZZ = new C098J<>(3);
    public boolean LIZIZ;
    public volatile boolean LIZLLL;
    public volatile long LJ;
    public volatile List<? extends LiveEffect> LJFF;
    public final long LIZ = MultiGuestSharedBgFlickConfigSetting.INSTANCE.getValue().alive;
    public volatile long LIZJ = System.currentTimeMillis();
    public final ConcurrentHashMap<String, Bitmap> LJI = new ConcurrentHashMap<>();
    public final C01GW LJII = C292401Bi.LIZ(new AwS559S0100000_15(this, 595));

    public final void LJI() {
        this.LIZJ = System.currentTimeMillis();
    }

    public final LiveEffect LIZJ(String str) {
        Long lValueOf;
        Long lValueOf2;
        User owner;
        LiveEffect next;
        LJI();
        if (str == null) {
            return null;
        }
        List<? extends LiveEffect> list = this.LJFF;
        if (list != null) {
            Iterator<? extends LiveEffect> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    LiveEffect liveEffect = next;
                    if (Intrinsics.LJFF(liveEffect.getResourceId(), str) && C500260Jjc.LJJIIZ(liveEffect.LJJLIIIJLLLLLLLZ())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LiveEffect liveEffect2 = next;
            if (liveEffect2 != null) {
                return liveEffect2;
            }
        }
        C098J<String, C915860ZwO> c098j = LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        if (roomLJIIIZ != null) {
            lValueOf = Long.valueOf(roomLJIIIZ.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append('_');
        Room roomLJIIIZ2 = C930540aK4.LJIIIZ();
        if (roomLJIIIZ2 != null && (owner = roomLJIIIZ2.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        } else {
            lValueOf2 = null;
        }
        sbLIZ.append(lValueOf2);
        C915860ZwO c915860ZwO = c098j.get(C2188811AlT.LIZIZ(sbLIZ));
        if (c915860ZwO != null) {
            String str2 = c915860ZwO.LIZIZ;
            String str3 = c915860ZwO.LIZJ;
            if (Intrinsics.LJFF(str2, str) && str3.length() > 0 && C762030Tur.LIZJ.length() > 0) {
                String fullPath = EnumC771350UNp.SHARE_EFFECT.getFullPath();
                LiveEffectOld liveEffectOld = new LiveEffectOld();
                liveEffectOld.LJI = str2;
                liveEffectOld.LJLIL = str3;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(C762030Tur.LIZJ);
                sbLIZ2.append(str3);
                liveEffectOld.LJLILLLLZI = C2188811AlT.LIZIZ(sbLIZ2);
                liveEffectOld.LJLIIL = true;
                if (new C0VSJ(fullPath, str3).exists()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(fullPath);
                    sbLIZ3.append(str3);
                    liveEffectOld.LJLJI = C2188811AlT.LIZIZ(sbLIZ3);
                    return liveEffectOld;
                }
                C403501hZ.LIZ(new AwS416S0200000_15(this, liveEffectOld, 61));
                return liveEffectOld;
            }
        }
        return null;
    }

    public final void LJFF(List<? extends LiveEffect> list) {
        boolean z;
        boolean z2 = true;
        if (this.LJFF != null && !Intrinsics.LJFF(this.LJFF, list)) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = list;
        try {
            int i = MultiGuestSharedBgFlickConfigSetting.INSTANCE.getValue().sample;
            C20337914i1<Integer> c20337914i1 = InterfaceC934710aQn.Uc;
            Integer numLIZIZ = c20337914i1.LIZIZ();
            if (i <= 0 || (numLIZIZ != null && numLIZIZ.intValue() == i)) {
                z2 = false;
            }
            c20337914i1.LJFF(Integer.valueOf(i));
            C403501hZ.LIZ(new C768670UDh(list, this, z, z2));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZLLL(String str, boolean z) {
        Long lValueOf;
        User owner;
        LJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        Long lValueOf2 = null;
        if (roomLJIIIZ != null) {
            lValueOf = Long.valueOf(roomLJIIIZ.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append('_');
        Room roomLJIIIZ2 = C930540aK4.LJIIIZ();
        if (roomLJIIIZ2 != null && (owner = roomLJIIIZ2.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        sbLIZ.append(lValueOf2);
        C915860ZwO c915860ZwO = LJIIIIZZ.get(C2188811AlT.LIZIZ(sbLIZ));
        if (c915860ZwO != null) {
            c915860ZwO.LIZ = z;
            if (str == null) {
                str = "";
            }
            c915860ZwO.LIZIZ = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String str, String str2, boolean z) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_tiny");
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (!z && c0vsj.exists()) {
                if (this.LJI.get(str) != null) {
                    C20441214yg.LJIIL("GuestSharedBgLoadHelper", "decodeAndCacheTinyBitmap cache");
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append("_tiny");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strLIZIZ, options);
                if (bitmapDecodeFile != null) {
                    this.LJI.put(str, bitmapDecodeFile);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("decodeAndCacheTinyBitmap success tiny, w=");
                    sbLIZ3.append(bitmapDecodeFile.getWidth());
                    sbLIZ3.append(" h=");
                    sbLIZ3.append(bitmapDecodeFile.getHeight());
                    C20441214yg.LIZIZ("GuestSharedBgLoadHelper", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                C20441214yg.LJIIL("GuestSharedBgLoadHelper", "decodeAndCacheTinyBitmap failed tiny, bitmap is null");
                return;
            }
            int i = MultiGuestSharedBgFlickConfigSetting.INSTANCE.getValue().sample;
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            if (i <= 0) {
                i = 10;
            }
            options2.inSampleSize = i;
            options2.inPreferredConfig = Bitmap.Config.RGB_565;
            Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(str2, options2);
            if (bitmapDecodeFile2 != null) {
                this.LJI.put(str, bitmapDecodeFile2);
                EnumC771350UNp enumC771350UNp = EnumC771350UNp.SHARE_EFFECT;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append("_tiny");
                C207206166i.LIZIZ(new C207207166j(C2188811AlT.LIZIZ(sbLIZ4), enumC771350UNp, bitmapDecodeFile2, false, null, 0 == true ? 1 : 0, 972));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("decodeAndCacheTinyBitmap success, w=");
                sbLIZ5.append(bitmapDecodeFile2.getWidth());
                sbLIZ5.append(" h=");
                sbLIZ5.append(bitmapDecodeFile2.getHeight());
                C20441214yg.LIZIZ("GuestSharedBgLoadHelper", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            C20441214yg.LJIIL("GuestSharedBgLoadHelper", "decodeAndCacheTinyBitmap failed, bitmap is null");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("decodeAndCacheTinyBitmap exception: ");
            sbLIZ6.append(th.getMessage());
            C20441214yg.LJ("GuestSharedBgLoadHelper", C2188811AlT.LIZIZ(sbLIZ6));
        }
    }

    public final void LIZIZ(final String str, String str2, final LiveEffect liveEffect) {
        if (str2 == null) {
            return;
        }
        final C207209166l c207209166l = new C207209166l(str, EnumC771350UNp.SHARE_EFFECT, null, null, str2, null, false, 1, true, 236);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadImage url:");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("GuestSharedBgLoadHelper", C2188811AlT.LIZIZ(sbLIZ));
        C207232167i.LIZIZ(c207209166l, new Function1<C0U3O, Unit>() { // from class: X.0aXn
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(C0U3O c0u3o) {
                c0u3o.LJFF(new AwS55S1300000_15(c207209166l, liveEffect, this, str, 1));
                return Unit.LIZ;
            }
        });
    }

    public final void LJ(LiveEffect liveEffect, boolean z, boolean z2) {
        String strLJJLIIIJLLLLLLLZ = liveEffect.LJJLIIIJLLLLLLLZ();
        if (strLJJLIIIJLLLLLLLZ == null) {
            return;
        }
        String strLJJ = liveEffect.LJJ();
        if (!TextUtils.isEmpty(strLJJ)) {
            if (z) {
                LIZIZ(strLJJLIIIJLLLLLLLZ, liveEffect.LLJLLIL(), liveEffect);
                return;
            } else {
                if (strLJJ == null) {
                    return;
                }
                LIZ(strLJJLIIIJLLLLLLLZ, strLJJ, z2);
                return;
            }
        }
        LIZIZ(strLJJLIIIJLLLLLLLZ, liveEffect.LLJLLIL(), liveEffect);
    }
}
