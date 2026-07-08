package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS13S1200000_8;
import Y.ARunnableS17S1200000_12;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS81S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ilD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254890ilD implements InterfaceC1245310iVl, WeakHandler.IHandler, InterfaceC1254900ilE {
    public static final List<C0TS5> LLJIJIL = new ArrayList();
    public final Fragment LL;
    public final Activity LLILLJJLI;
    public final boolean LLILLL;
    public final Function1<List<String>, Unit> LLILZ;
    public C1255650imR LLILZIL;
    public final WeakHandler LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public List<? extends C2259691DcV> LLJ;
    public DialogC1389620mGW LLJI;

    public C1254890ilD() {
        throw null;
    }

    @Override // X.InterfaceC1254900ilE
    public final void LIZ() {
    }

    @Override // X.InterfaceC1254900ilE
    public final void LIZIZ(String str) {
    }

    public final void LIZLLL() {
        Activity activity;
        Fragment fragment = this.LL;
        if ((fragment == null || (activity = fragment.getActivity()) == null) && (activity = this.LLILLJJLI) == null) {
            return;
        }
        activity.runOnUiThread(new ARunnableS112S0100000_12(this, 17));
    }

    public final void LJFF(String str) {
        Activity activity;
        Fragment fragment = this.LL;
        if ((fragment != null && (activity = fragment.getActivity()) != null) || (activity = this.LLILLJJLI) != null) {
            activity.runOnUiThread(new ARunnableS17S1200000_12(this, activity, str, 0));
            C1250680ieQ.LJIL(C1250680ieQ.LIZ, "photo", "fail");
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Activity activity;
        if (message == null) {
            return;
        }
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if (messageObj instanceof Exception) {
            Throwable th = (Exception) HandlerHook.getMessageObj(message.obj);
            if (this.LLIZ < 4 && ((th instanceof IOException) || (th instanceof SocketTimeoutException) || ((th instanceof C632200Oqw) && C1697810uHb.LJIIJJI(-1, -2, -3).contains(Integer.valueOf(((C632200Oqw) th).getErrorCode()))))) {
                int i = this.LLIZ + 1;
                this.LLIZ = i;
                C1255650imR c1255650imR = this.LLILZIL;
                if (c1255650imR != null) {
                    C810560Vqw.LIZLLL(new ARunnableS13S1200000_8(c1255650imR, this.LLIZLLLIL, this.LLJ, 2), (i << 1) * LSPassThroughRecordSizeConfig.DEFAULT);
                    return;
                }
                return;
            }
            Fragment fragment = this.LL;
            if ((fragment != null && (activity = fragment.getActivity()) != null) || (activity = this.LLILLJJLI) != null) {
                activity.runOnUiThread(new ARunnableS45S0300000_12(this, th, activity, 3));
                return;
            }
            return;
        }
        if (messageObj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) HandlerHook.getMessageObj(message.obj);
            this.LLIZ = 0;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C641610PEp(avatarUri.uri, this, avatarUri.urlList, null), 3);
        }
    }

    public final void LJI(Activity activity, Fragment fragment) {
        Activity activity2;
        if (fragment == null || (activity2 = fragment.getActivity()) == null) {
            if (activity == null) {
                return;
            } else {
                activity2 = activity;
            }
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1255650imR(activity2, fragment, this.LLILZLL, this, EnumC1254860ilA.PROFILE.getValue(), new C1255630imP());
        }
        C1255650imR c1255650imR = this.LLILZIL;
        if (c1255650imR != null) {
            c1255650imR.LJIILJJIL(40);
        }
    }

    public final boolean LJ(int i, int i2, Intent intent) {
        Activity activity;
        Uri data;
        Context activity2;
        String strLIZ;
        Activity activity3;
        if (i != 10040) {
            if (i != 10041) {
                return false;
            }
            if (i2 != -1 || intent == null || (data = intent.getData()) == null) {
                return true;
            }
            Fragment fragment = this.LL;
            if (((fragment == null || (activity2 = fragment.getActivity()) == null) && (activity2 = this.LLILLJJLI) == null) || (strLIZ = C09N5.LIZ(activity2, data)) == null) {
                return true;
            }
            this.LLIZLLLIL = strLIZ;
            this.LLJ = C1697810uHb.LJ(new C2259691DcV("source", "40"));
            this.LLIZ = 0;
            Fragment fragment2 = this.LL;
            if ((fragment2 != null && (activity3 = fragment2.getActivity()) != null) || (activity3 = this.LLILLJJLI) != null) {
                activity3.runOnUiThread(new ARunnableS81S0200000_12(activity3, this, 14));
            }
            C1255650imR c1255650imR = this.LLILZIL;
            if (c1255650imR == null) {
                return true;
            }
            List<? extends C2259691DcV> list = this.LLJ;
            InterfaceC1254900ilE interfaceC1254900ilE = c1255650imR.LIZLLL;
            if (interfaceC1254900ilE != null) {
                interfaceC1254900ilE.LIZ();
            }
            C810560Vqw.LIZLLL(new ARunnableS13S1200000_8(c1255650imR, strLIZ, list, 2), 0);
            return true;
        }
        if (i2 != -1 || intent == null) {
            return true;
        }
        Uri data2 = intent.getData();
        Fragment fragment3 = this.LL;
        if ((fragment3 == null || (activity = fragment3.getActivity()) == null) && (activity = this.LLILLJJLI) == null) {
            return true;
        }
        if (C2400409as.LJIIIZ(activity, data2) && data2 != null) {
            Fragment fragment4 = this.LL;
            if (fragment4 != null) {
                String str = CropActivity._pnsPageId;
                String string = data2.toString();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("type", "background", bundle);
                C21508119Ff.LIZIZ(fragment4, string, false, 0.375f, iLIZIZ, 10041, 150, 150, 40, false, bundle, false, false, true);
                return true;
            }
            Activity activity4 = this.LLILLJJLI;
            if (activity4 == null) {
                return true;
            }
            String str2 = CropActivity._pnsPageId;
            String string2 = data2.toString();
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("type", "background", bundle2);
            C21508119Ff.LIZ(activity4, string2, false, 0.375f, iLIZIZ2, 10041, 150, 150, 40, false, bundle2, false, false, true);
            return true;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJFF(2130970439);
        c1389890mGx.LJIIIZ(2131839843);
        c1389890mGx.LJIIJJI();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    @Override // X.InterfaceC1245310iVl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(androidx.fragment.app.Fragment r11, com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo r12, boolean r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1254890ilD.LIZJ(androidx.fragment.app.Fragment, com.ss.android.ugc.profile.platform.base.data.ProfileBgInfo, boolean, android.view.View):void");
    }

    public C1254890ilD(Fragment fragment, BaseActivity baseActivity, boolean z, Function1 function1, int i) {
        fragment = (i & 1) != 0 ? null : fragment;
        baseActivity = (i & 2) != 0 ? null : baseActivity;
        z = (i & 4) != 0 ? false : z;
        this.LL = fragment;
        this.LLILLJJLI = baseActivity;
        this.LLILLL = z;
        this.LLILZ = function1;
        this.LLILZLL = new WeakHandler(this);
    }
}
