package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorEnterForegroundBlackScreenOptABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ua0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774580Ua0 {
    public final DataChannel LIZ;
    public final InterfaceC769940UIe LIZIZ;
    public final C0UZ9 LIZJ;
    public final InterfaceC774600Ua2 LIZLLL;
    public SoftReference<Bitmap> LJ;

    public final void LIZLLL() {
        Bitmap bitmap;
        if (AnchorEnterForegroundBlackScreenOptABSetting.INSTANCE.enable()) {
            SoftReference<Bitmap> softReference = this.LJ;
            if (softReference != null && (bitmap = softReference.get()) != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            this.LJ = null;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public static Bitmap LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final void LIZJ(Bitmap bitmap, Cert cert) {
        if (bitmap != null) {
            InterfaceC769940UIe interfaceC769940UIe = this.LIZIZ;
            if (interfaceC769940UIe != null) {
                interfaceC769940UIe.n3(bitmap, cert);
                return;
            }
            return;
        }
        InterfaceC769940UIe interfaceC769940UIe2 = this.LIZIZ;
        if (interfaceC769940UIe2 == null) {
            return;
        }
        interfaceC769940UIe2.LJIILL(cert);
    }

    public C774580Ua0(DataChannel dataChannel, InterfaceC769940UIe interfaceC769940UIe, C0UZ9 c0uz9, InterfaceC774600Ua2 interfaceC774600Ua2) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC769940UIe;
        this.LIZJ = c0uz9;
        this.LIZLLL = interfaceC774600Ua2;
        if (dataChannel != null) {
            dataChannel.CQ2(PauseLiveChannel.class, this, new C0UYX(this));
        }
    }

    public final void LIZIZ(final Cert cert, final boolean z, boolean z2, final Function0<Boolean> function0) {
        Room room;
        User owner;
        ImageModel avatarThumb;
        Boolean boolValueOf;
        Bitmap bitmap;
        float fLJIIZILJ = C497740JfY.LJIIZILJ() / C497740JfY.LJIILLIIL();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
            Bitmap bitmap2 = null;
            if (z2) {
                LIZJ(null, cert);
                return;
            }
            SoftReference<Bitmap> softReference = this.LJ;
            if (softReference != null && softReference.get() != null) {
                SoftReference<Bitmap> softReference2 = this.LJ;
                if (softReference2 != null && (bitmap = softReference2.get()) != null) {
                    boolValueOf = Boolean.valueOf(bitmap.isRecycled());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIFFI(boolValueOf) && AnchorEnterForegroundBlackScreenOptABSetting.INSTANCE.enable()) {
                    if (!z) {
                        if (function0 != null && function0.invoke().booleanValue()) {
                            SoftReference<Bitmap> softReference3 = this.LJ;
                            if (softReference3 != null) {
                                bitmap2 = softReference3.get();
                            }
                            LIZJ(LIZ(bitmap2), cert);
                            return;
                        }
                        return;
                    }
                    SoftReference<Bitmap> softReference4 = this.LJ;
                    if (softReference4 != null) {
                        bitmap2 = softReference4.get();
                    }
                    LIZJ(LIZ(bitmap2), cert);
                    return;
                }
            }
            C1324570kZb.LJII(avatarThumb, C497740JfY.LJIIZILJ(), C497740JfY.LJIILLIIL(), new C1291830jin(fLJIIZILJ), new InterfaceC1324590kZd() { // from class: X.0Ua1
                @Override // X.InterfaceC1324590kZd
                public final void onFailed() {
                    this.LIZ.LIZJ(null, cert);
                }

                @Override // X.InterfaceC1324590kZd
                public final void LIZ(Bitmap bitmap3) {
                    if (AnchorEnterForegroundBlackScreenOptABSetting.INSTANCE.enable()) {
                        C774580Ua0 c774580Ua0 = this.LIZ;
                        c774580Ua0.getClass();
                        c774580Ua0.LJ = new SoftReference<>(bitmap3);
                        InterfaceC774600Ua2 interfaceC774600Ua2 = this.LIZ.LIZLLL;
                        if (interfaceC774600Ua2 != null) {
                            interfaceC774600Ua2.LIZ();
                        }
                    }
                    if (!z) {
                        Function0<Boolean> function02 = function0;
                        if (function02 != null && function02.invoke().booleanValue()) {
                            C774580Ua0 c774580Ua02 = this.LIZ;
                            c774580Ua02.getClass();
                            c774580Ua02.LIZJ(C774580Ua0.LIZ(bitmap3), cert);
                            return;
                        }
                        return;
                    }
                    C774580Ua0 c774580Ua03 = this.LIZ;
                    c774580Ua03.getClass();
                    c774580Ua03.LIZJ(C774580Ua0.LIZ(bitmap3), cert);
                }
            });
        }
    }
}
