package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import lth.o;

/* JADX INFO: renamed from: X.0MAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564180MAu {
    public static void LIZ(final Context context, final InterfaceC564220MAy interfaceC564220MAy) {
        String str;
        if (!(context instanceof C19EG)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reuse mv is not fragment activity:");
            sbLIZ.append(context);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            ((C564210MAx) interfaceC564220MAy).LIZ();
            return;
        }
        if (C533930Kwp.LIZJ()) {
            C201955140j.LIZ("reuse mv get permission succ");
            ((C564210MAx) interfaceC564220MAy).LIZ();
            return;
        }
        o.LJJ.LJ().LIZ();
        C201955140j.LIZ("reuse mv support runtime permission");
        C0LH5 c0lh5 = new C0LH5() { // from class: X.0MAw
            @Override // X.C0LH5
            public final void LIZ(int[] iArr, String[] strArr) {
                final boolean z;
                final InterfaceC564220MAy interfaceC564220MAy2 = interfaceC564220MAy;
                final Context context2 = context;
                if (iArr != null && iArr.length != 0 && strArr != null && strArr.length != 0) {
                    for (int i : iArr) {
                        if (i == -1) {
                            C201955140j.LJ("reuse mv deny permission");
                            String[] strArr2 = {"android.permission.WRITE_EXTERNAL_STORAGE"};
                            if (Build.VERSION.SDK_INT >= 33) {
                                strArr2 = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                            }
                            int length = strArr2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    String str2 = strArr2[i2];
                                    if (o.LJJ.LJ().LIZJ(context2, str2) == -1 && !o.LJJ.LJ().LIZIZ(C1388190mED.LIZ(context2), str2)) {
                                        z = true;
                                        break;
                                    }
                                    i2++;
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            C21566919al c21566919al = new C21566919al(context2);
                            c21566919al.LIZ(2131826619);
                            c21566919al.LJII(2131826620, null, false);
                            c21566919al.LJIIJ(R.string.ftf, new DialogInterface.OnClickListener() { // from class: X.0MAv
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    boolean z2 = z;
                                    Context context3 = context2;
                                    InterfaceC564220MAy interfaceC564220MAy3 = interfaceC564220MAy2;
                                    if (z2) {
                                        C201955140j.LIZ("reuse support open setting activity");
                                        o.LJJ.LJ().LIZLLL(context3);
                                    } else {
                                        C201955140j.LIZ("reuse not support open setting activity");
                                        C564180MAu.LIZ(context3, interfaceC564220MAy3);
                                    }
                                }
                            }, false);
                            C21566519ah c21566519ah = new C21566519ah(c21566919al);
                            if (!(context2 instanceof Activity) || !C1388190mED.LIZ(context2).isFinishing()) {
                                try {
                                    c21566519ah.LIZLLL();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            Activity activity = ((C564210MAx) interfaceC564220MAy2).LIZ;
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            creativeToastBuilder.messageRes(2131839204);
                            C1390380mHk.LIZ(activity, 6004, creativeToastBuilder);
                            return;
                        }
                    }
                    C201955140j.LIZ("reuse mv allow permission");
                    ((C564210MAx) interfaceC564220MAy2).LIZ();
                    return;
                }
                C201955140j.LJ("reuse mv permission is empty!");
                ((C564210MAx) interfaceC564220MAy2).LIZ();
            }
        };
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            str = "bpea-tools_request_storage_permission_photo_mv_anchor_target33";
        } else {
            str = "bpea-tools_request_storage_permission_photo_mv_anchor";
        }
        C19514711Wn c19514711WnLIZLLL = C19514711Wn.LIZLLL(c19egLIZIZ, TokenCert.with(str));
        if (i >= 33) {
            c19514711WnLIZLLL.LIZIZ("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        } else {
            c19514711WnLIZLLL.LIZIZ("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        c19514711WnLIZLLL.LIZJ(new C581140Mqm(c0lh5, 1));
    }
}
