package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1466520oGY extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

    public static final void Ad$0(C1466520oGY c1466520oGY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$1(C1466520oGY c1466520oGY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$2(C1466520oGY c1466520oGY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
            default:
                super.Ad(uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C1466520oGY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$0(C1466520oGY c1466520oGY, Uri uri, View view, Throwable th) {
        C1324840ka2.LIZ(((C1418960n1q) c1466520oGY.l0).LLILZ, R.drawable.bzi);
    }

    public static final void cm$1(C1466520oGY c1466520oGY, Uri uri, View view, Throwable th) {
        if (C295860Bii.LIZ()) {
            ((C1419030n1x) c1466520oGY.l0).LLILLJJLI.setBackgroundResource(C1419030n1x.L5());
            C337180DJs.LIZ(((C1419030n1x) c1466520oGY.l0).LL);
        } else {
            ((C1419030n1x) c1466520oGY.l0).LL.setBackgroundResource(C1419030n1x.L5());
            C337180DJs.LIZ(((C1419030n1x) c1466520oGY.l0).LLILLJJLI);
        }
    }

    public static final void cm$2(C1466520oGY c1466520oGY, Uri uri, View view, Throwable th) {
        if (C295860Bii.LIZ()) {
            ((C1419030n1x) c1466520oGY.l0).LLILLJJLI.setBackgroundResource(C1419030n1x.L5());
            C337180DJs.LIZ(((C1419030n1x) c1466520oGY.l0).LL);
        } else {
            ((C1419030n1x) c1466520oGY.l0).LL.setBackgroundResource(C1419030n1x.L5());
            C337180DJs.LIZ(((C1419030n1x) c1466520oGY.l0).LLILLJJLI);
        }
    }

    public static final void cm$3(C1466520oGY c1466520oGY, Uri uri, View view, Throwable th) {
        MixEditingMaterialType mixEditingMaterialType;
        String message;
        String description;
        String strLIZIZ;
        UrlModel urlModel;
        List<String> urlList;
        Object objLJJJLZIJ;
        MixEditingMaterialType mixEditingMaterialType2;
        C1412800mru c1412800mru = ((C1419030n1x) c1466520oGY.l0).LLIZLLLIL;
        String message2 = null;
        if (c1412800mru != null) {
            mixEditingMaterialType = c1412800mru.LIZ;
        } else {
            mixEditingMaterialType = null;
        }
        if (mixEditingMaterialType == MixEditingMaterialType.LYRICS_RULE_TEMPLATE) {
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FAIL uri=");
            sbLIZ.append(uri);
            sbLIZ.append(" err=");
            if (th != null) {
                message2 = th.getMessage();
            }
            sbLIZ.append(message2);
            C1426005i6.LIZJ(c0mj8, "UI.MixEditing.Cover", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C295860Bii.LIZ()) {
            ((C1419030n1x) c1466520oGY.l0).LLILLJJLI.setBackgroundResource(C1419030n1x.L5());
            C337180DJs.LIZ(((C1419030n1x) c1466520oGY.l0).LL);
        } else {
            ((C1419030n1x) c1466520oGY.l0).LL.setBackgroundResource(C1419030n1x.L5());
            C337180DJs.LIZ(((C1419030n1x) c1466520oGY.l0).LLILLJJLI);
        }
        C1419030n1x c1419030n1x = (C1419030n1x) c1466520oGY.l0;
        Object obj = "";
        c1419030n1x.N5(c1419030n1x.LLIZLLLIL, new C1419080n22(c1419030n1x.LLJ, 1, ""));
        C1419030n1x c1419030n1x2 = (C1419030n1x) c1466520oGY.l0;
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        c1419030n1x2.getClass();
        HashMap map = new HashMap();
        map.put("errorMessage", message);
        C1412800mru c1412800mru2 = c1419030n1x2.LLIZLLLIL;
        if (c1412800mru2 == null || (mixEditingMaterialType2 = c1412800mru2.LIZ) == null || (description = mixEditingMaterialType2.getDescription()) == null) {
            description = "";
        }
        map.put("autoEditType", description);
        C1412800mru c1412800mru3 = c1419030n1x2.LLIZLLLIL;
        if (c1412800mru3 == null) {
            strLIZIZ = "";
        } else {
            strLIZIZ = c1412800mru3.LIZIZ();
        }
        map.put("autoEditId", strLIZIZ);
        C1412800mru c1412800mru4 = c1419030n1x2.LLIZLLLIL;
        if (c1412800mru4 != null && (urlModel = c1412800mru4.LIZJ) != null && (urlList = urlModel.getUrlList()) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urlList)) != null) {
            obj = objLJJJLZIJ;
        }
        map.put("coverUrl", obj);
        Npth.reportBizException("MixEditingLoadCoverException", new Throwable(map.toString()), map.toString(), (Map<String, String>) map, true);
    }

    public static final void Ad$3(C1466520oGY c1466520oGY, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C1419030n1x c1419030n1x = (C1419030n1x) c1466520oGY.l0;
        c1419030n1x.N5(c1419030n1x.LLIZLLLIL, new C1419080n22(c1419030n1x.LLJ, 0, ""));
    }
}
