package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015920cXm implements InterfaceC1337220ku0 {
    public final String LIZ;
    public final String LIZIZ;
    public final Function1<C1015960cXq, Unit> LIZJ;

    public final C1020920cfq LJ(String str, ImageView imageView) {
        Object tag;
        String str2 = null;
        if (imageView != null) {
            tag = imageView.getTag(R.id.ugen_carousel_node_id);
        } else {
            tag = null;
        }
        if (tag instanceof String) {
            str2 = (String) tag;
        }
        C1020920cfq c1020920cfqLIZIZ = C08JM.LIZIZ(this.LIZIZ, str, str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveTrackTag componentInstanceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" url=");
        sbLIZ.append(str);
        sbLIZ.append(" nodeId=");
        sbLIZ.append(str2);
        sbLIZ.append(" trackTag=");
        sbLIZ.append(c1020920cfqLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return c1020920cfqLIZIZ;
    }

    public C1015920cXm(String str, String str2, AwS595S0100000_16 awS595S0100000_16) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = awS595S0100000_16;
    }

    @Override // X.InterfaceC1337220ku0
    public final void LIZ(C1015650cXL c1015650cXL, String str, InterfaceC1015950cXp interfaceC1015950cXp) {
        Context context;
        if (c1015650cXL != null) {
            context = c1015650cXL.LIZ;
        } else {
            context = null;
        }
        LIZJ(context, str, null, null, null, interfaceC1015950cXp, LJ(str, null));
    }

    public final void LIZLLL(String str, boolean z, String str2, C1020920cfq c1020920cfq) {
        if (c1020920cfq == null) {
            c1020920cfq = C08JM.LIZIZ(this.LIZIZ, str, null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyImageLoadResult componentInstanceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" url=");
        sbLIZ.append(str);
        sbLIZ.append(" success=");
        sbLIZ.append(z);
        sbLIZ.append(" failReason=");
        sbLIZ.append(str2);
        sbLIZ.append(" trackTag=");
        sbLIZ.append(c1020920cfq);
        C2188811AlT.LIZIZ(sbLIZ);
        Function1<C1015960cXq, Unit> function1 = this.LIZJ;
        if (function1 != null) {
            function1.invoke(new C1015960cXq(str, z, str2, c1020920cfq));
        }
    }

    @Override // X.InterfaceC1337220ku0
    public final void LIZIZ(C1015650cXL c1015650cXL, String str, ImageView imageView, int i, int i2, InterfaceC1015950cXp interfaceC1015950cXp) {
        Context context;
        if (c1015650cXL != null) {
            context = c1015650cXL.LIZ;
        } else {
            context = null;
        }
        LIZJ(context, str, imageView, Integer.valueOf(i), Integer.valueOf(i2), interfaceC1015950cXp, LJ(str, imageView));
    }

    public final void LIZJ(final Context context, final String str, final ImageView imageView, final Integer num, final Integer num2, final InterfaceC1015950cXp interfaceC1015950cXp, final C1020920cfq c1020920cfq) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgenImageProvider loadImage() invoke,url = ");
        sbLIZ.append(str);
        sbLIZ.append(" ,height = ");
        sbLIZ.append(num2);
        sbLIZ.append(",width = ");
        sbLIZ.append(num);
        C2188811AlT.LIZIZ(sbLIZ);
        if (context == null || str == null) {
            return;
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0cXn
            public final void LIZ() {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                Integer num3 = num;
                if (num3 != null && num2 != null && num3.intValue() > 0 && num2.intValue() > 0) {
                    int iIntValue = num.intValue();
                    int iIntValue2 = num2.intValue();
                    c1331670kl3LJIIIZ.LJIIIIZZ = iIntValue;
                    c1331670kl3LJIIIZ.LJIIIZ = iIntValue2;
                }
                c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIIZ.LIZLLL(this.LIZ);
                c1331670kl3LJIIIZ.LJJIJL(context);
                final ImageView imageView2 = imageView;
                final InterfaceC1015950cXp interfaceC1015950cXp2 = interfaceC1015950cXp;
                final C1015920cXm c1015920cXm = this;
                final String str2 = str;
                final C1020920cfq c1020920cfq2 = c1020920cfq;
                c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.0cXo
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("UgenImageProvider loadImageWithUrl onCompleted bitmap = ");
                        sbLIZ2.append(bitmap);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (bitmap != null) {
                            ImageView imageView3 = imageView2;
                            if (imageView3 != null) {
                                imageView3.setImageBitmap(bitmap);
                            }
                            InterfaceC1015950cXp interfaceC1015950cXp3 = interfaceC1015950cXp2;
                            if (interfaceC1015950cXp3 != null) {
                                interfaceC1015950cXp3.LIZ(bitmap);
                            }
                            c1015920cXm.LIZLLL(str2, true, null, c1020920cfq2);
                            return;
                        }
                        InterfaceC1015950cXp interfaceC1015950cXp4 = interfaceC1015950cXp2;
                        if (interfaceC1015950cXp4 != null) {
                            interfaceC1015950cXp4.LIZ(null);
                        }
                        c1015920cXm.LIZLLL(str2, false, "bitmap_empty", c1020920cfq2);
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        InterfaceC1015950cXp interfaceC1015950cXp3 = interfaceC1015950cXp2;
                        Throwable cause = null;
                        if (interfaceC1015950cXp3 != null) {
                            interfaceC1015950cXp3.LIZ(null);
                        }
                        c1015920cXm.LIZLLL(str2, false, "image_load_failed", c1020920cfq2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("UgenImageProvider loadImageWithUrl onFailed errorMessage = ");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ2.append(message);
                        sbLIZ2.append(",cause = ");
                        if (th != null) {
                            cause = th.getCause();
                        }
                        sbLIZ2.append(cause);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                });
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UgenImageProvider@e158.loadImageUrl$3");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UgenImageProvider@e158.loadImageUrl$3");
            }
        });
    }
}
