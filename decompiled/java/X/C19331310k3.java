package X;

import Y.ACallableS411S0100000_3;
import android.app.Activity;
import android.app.Dialog;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.push.PushBody;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.api.model.PassThroughMessage;
import com.ss.android.ugc.aweme.innerpush.model.PushWrapper;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10k3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19331310k3 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1909720znO());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20641215pq());

    public static final void LIZ(InnerPushMessage innerPushMessage) {
        if (((Boolean) C1865980yeq.LIZLLL.getValue()).booleanValue()) {
            int type = innerPushMessage.getType();
            if (type != 29) {
                if (type != 2395) {
                    switch (type) {
                        case 3:
                        case 4:
                            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                            if (uiTemplate != null) {
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = R.raw.icon_color_comment_circle;
                                C844470XAv.LIZ.getClass();
                                uiTemplate.setAvatarRightLabelDrawable(c419910GdJ.LIZ(C844470XAv.LIZ()));
                            }
                            break;
                        case 5:
                        case 6:
                        case 7:
                            InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                            if (uiTemplate2 != null) {
                                C419910GdJ c419910GdJ2 = new C419910GdJ();
                                c419910GdJ2.LIZ = R.raw.icon_color_at_circle;
                                C844470XAv.LIZ.getClass();
                                uiTemplate2.setAvatarRightLabelDrawable(c419910GdJ2.LIZ(C844470XAv.LIZ()));
                            }
                            break;
                    }
                    return;
                }
                InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
                if (uiTemplate3 == null) {
                    return;
                }
                C419910GdJ c419910GdJ3 = new C419910GdJ();
                c419910GdJ3.LIZ = R.raw.icon_color_like_circle_inbox;
                C844470XAv.LIZ.getClass();
                uiTemplate3.setAvatarRightLabelDrawable(c419910GdJ3.LIZ(C844470XAv.LIZ()));
                return;
            }
            InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
            if (uiTemplate4 == null) {
                return;
            }
            C419910GdJ c419910GdJ4 = new C419910GdJ();
            c419910GdJ4.LIZ = R.raw.icon_color_view_circle;
            C844470XAv.LIZ.getClass();
            uiTemplate4.setAvatarRightLabelDrawable(c419910GdJ4.LIZ(C844470XAv.LIZ()));
        }
    }

    public static final ViewGroup LJ(Activity activity) {
        Fragment fragment;
        View decorView;
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        Fragment next;
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null) {
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Fragment fragment2 = next;
                    if ((fragment2 instanceof DialogFragment) && fragment2.isVisible()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            fragment = next;
        } else {
            fragment = null;
        }
        if (!(fragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) fragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            Window window2 = activity.getWindow();
            if (window2 != null) {
                decorView = window2.getDecorView();
            } else {
                decorView = null;
            }
        }
        if (!(decorView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) decorView;
    }

    public static final HashMap<String, String> LJFF(InnerPushMessage innerPushMessage) {
        Object c098200Yq;
        HashMap<String, String> map = new HashMap<>();
        try {
            String bizExtraJsonStr = innerPushMessage.getBizExtraJsonStr();
            if (bizExtraJsonStr != null) {
                JSONObject jSONObject = new JSONObject(bizExtraJsonStr);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next));
                }
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19290510dT.LIZJ("InnerPushMob", "getInnerPushExtraInfoMap error", thM5exceptionOrNullimpl);
        }
        return map;
    }

    public static final boolean LJI(String str) {
        if (str == null || str.length() == 0 || !u.LJJIIJZLJL(str, "{", false) || !u.LJIIZILJ(str, "}", false)) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static final void LJII(Function0<Unit> function0) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            function0.invoke();
        } else {
            C15O7.LIZIZ(new ACallableS411S0100000_3((Function0) function0, 12), C15O7.LJIIIIZZ, null);
        }
    }

    public static final C15O7<Unit> LJIIJ(Function0<Unit> function0) {
        return C15O7.LIZIZ(new ACallableS411S0100000_3((Function0) function0, 10), (Executor) C2252408s6.LIZ.getValue(), null);
    }

    public static final boolean LJIIJJI(InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && uiTemplate.rightType == 8 && C560910LzF.LIZIZ()) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(InnerPushMessage innerPushMessage, String str) {
        if (str != null && str.length() != 0 && !Intrinsics.LJFF(str, "null") && innerPushMessage.getProtocol() == 2) {
            innerPushMessage.setPayload((Serializable) JsonParseUtils.LIZLLL(PassThroughMessage.class, str));
        }
    }

    public static final void LIZJ(InnerPushMessage innerPushMessage, PushBody pushBody) {
        InnerPushUITemplate uiTemplate;
        if (innerPushMessage.getConvertFromExternal() && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            String str = uiTemplate.title;
            if (str == null || str.length() == 0) {
                uiTemplate.setTitle(pushBody.title);
            }
            String str2 = uiTemplate.content;
            if (str2 == null || str2.length() == 0) {
                uiTemplate.setContent(pushBody.text);
            }
            List<String> list = uiTemplate.avatarUrls;
            if (list == null || list.isEmpty()) {
                uiTemplate.setAvatarUrls(Collections.singletonList(pushBody.imageUrl));
            }
            String str3 = uiTemplate.globalSchemaUrl;
            if (str3 == null || str3.length() == 0) {
                uiTemplate.setGlobalSchemaUrl(pushBody.open_url);
            }
        }
    }

    public static final void LIZLLL(InnerPushMessage innerPushMessage, PushWrapper pushWrapper) {
        InnerPushUITemplate uiTemplate;
        if (innerPushMessage.getConvertFromExternal() && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            String str = uiTemplate.title;
            if (str == null || str.length() == 0) {
                uiTemplate.setTitle(pushWrapper.getTitle());
            }
            String str2 = uiTemplate.content;
            if (str2 == null || str2.length() == 0) {
                uiTemplate.setContent(pushWrapper.getContent());
            }
            List<String> list = uiTemplate.avatarUrls;
            if (list == null || list.isEmpty()) {
                uiTemplate.setAvatarUrls(Collections.singletonList(pushWrapper.getImageUrl()));
            }
            String str3 = uiTemplate.globalSchemaUrl;
            if (str3 == null || str3.length() == 0) {
                uiTemplate.setGlobalSchemaUrl(pushWrapper.getOpenUrl());
            }
        }
    }

    public static final void LJIIIIZZ(SmartRoute smartRoute, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        List<String> list;
        String str;
        List<String> list2;
        if (innerPushMessage == null) {
            return;
        }
        if ((innerPushMessage.getType() == 3 || innerPushMessage.getType() == 4 || innerPushMessage.getType() == 6) && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (list = uiTemplate.avatarUrls) != null && list.size() == 1) {
            InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
            String str2 = null;
            if (uiTemplate2 != null && (list2 = uiTemplate2.avatarUrls) != null) {
                str = (String) C13LP.LJJJLL(list2);
            } else {
                str = null;
            }
            smartRoute.withParam("expose_avatar_url", str);
            InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
            if (uiTemplate3 != null) {
                str2 = uiTemplate3.title;
            }
            smartRoute.withParam("expose_username", str2);
            String str3 = LJFF(innerPushMessage).get("raw_comment");
            if (str3 == null) {
                str3 = "";
            }
            smartRoute.withParam("expose_comment_text", str3);
            int type = innerPushMessage.getType();
            if (type != 3) {
                if (type != 4) {
                    if (type == 6) {
                        smartRoute.withParam("expose_type", "MENTION");
                        return;
                    }
                    return;
                }
                smartRoute.withParam("expose_type", "REPLY");
                return;
            }
            smartRoute.withParam("expose_type", "COMMENT");
        }
    }

    public static final InnerPushMessage LJIIIZ(String str, boolean z) {
        boolean z2;
        Object objOpt;
        JSONObject jSONObject;
        String strJ3;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || !LJI(str) || (objOpt = new JSONObject(str).opt("social_inapp_push")) == null) {
            return null;
        }
        if ((objOpt instanceof String) && ((CharSequence) objOpt).length() > 0 && !Intrinsics.LJFF(objOpt, "null")) {
            strJ3 = (String) objOpt;
            jSONObject = new JSONObject(strJ3);
        } else {
            if (objOpt instanceof JSONObject) {
                jSONObject = (JSONObject) objOpt;
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            return null;
        }
        InnerPushMessage innerPushMessage = (InnerPushMessage) C08JS.LIZ(strJ3, InnerPushMessage.class);
        if (z && innerPushMessage != null) {
            try {
                if (innerPushMessage.getProtocol() >= 2) {
                    LIZIZ(innerPushMessage, jSONObject.optString("payload"));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C19290510dT.LIZJ("InnerPushMessage", "applyPayload from innerJson error", thM5exceptionOrNullimpl);
            }
        }
        return innerPushMessage;
    }
}
