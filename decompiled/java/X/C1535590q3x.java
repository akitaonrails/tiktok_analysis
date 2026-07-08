package X;

import android.app.Activity;
import android.app.Application;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.hybrid.LivePrefixInjectToHostSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSubResourceMemoryCacheSettingSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0q3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535590q3x {
    public static final void LIZ() {
        Activity topActivity;
        C1533850q19 c1533850q19;
        C1533560q0g c1533560q0g;
        C2027907wz c2027907wz;
        String path;
        C1533560q0g c1533560q0g2;
        List<String> list;
        String path2;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction == null || (topActivity = iHostAction.getTopActivity()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Pattern pattern : (ArrayList) C1152580g6C.LIZ()) {
            if (pattern != null && pattern.toString().length() > 0 && (path2 = UriProtector.parse(pattern.toString()).getPath()) != null && path2.length() != 0 && !arrayList.contains(path2)) {
                arrayList.add(path2);
            }
        }
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        C1075480e5q c1075480e5qLIZIZ = C1075530e5v.LIZIZ();
        Application application = topActivity.getApplication();
        String geckoHost = ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).getGeckoHost();
        C1533570q0h c1533570q0h = new C1533570q0h(((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).dp(), "offlineX", null, null, null, null, true, 188);
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        ArrayList arrayList2 = null;
        c1533570q0h.LJII = (InterfaceC1504290pFT) (iHostResource != null ? iHostResource.NS(topActivity) : null);
        c1075480e5qLIZIZ.LIZ("live", C1533850q19.class, new C1533850q19(application, new C1533560q0g(geckoHost, c1533570q0h, arrayList)));
        C1075480e5q c1075480e5qLIZIZ2 = C1075530e5v.LIZIZ();
        String geckoHost2 = ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).getGeckoHost();
        C1533330q0J c1533330q0J = new C1533330q0J(((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).dp(), "offlineX", true);
        IHostResource iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        c1533330q0J.LIZLLL = (InterfaceC1504290pFT) (iHostResource2 != null ? iHostResource2.NS(topActivity) : null);
        c1075480e5qLIZIZ2.LIZ("live", C1535610q3z.class, new C1535610q3z(new C1532950pzh(new C1533300q0G("Live_Forest", geckoHost2, c1533330q0J, arrayList, 8))));
        if (LivePrefixInjectToHostSetting.INSTANCE.getValue()) {
            C1533850q19 c1533850q192 = (C1533850q19) C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "hybridkit_default_bid");
            ArrayList arrayList3 = (c1533850q192 == null || (c1533560q0g2 = c1533850q192.LIZJ) == null || (list = c1533560q0g2.LIZLLL) == null) ? new ArrayList() : new ArrayList(list);
            for (Pattern pattern2 : (ArrayList) C1152580g6C.LIZ()) {
                if (pattern2 != null && pattern2.toString().length() > 0 && (path = UriProtector.parse(pattern2.toString()).getPath()) != null && path.length() != 0 && !arrayList3.contains(path)) {
                    arrayList3.add(path);
                }
            }
            C01GW<C1075480e5q> c01gw2 = C1075480e5q.LIZIZ;
            C1533850q19 c1533850q193 = (C1533850q19) C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "hybridkit_default_bid");
            if (c1533850q193 != null && (c1533560q0g = c1533850q193.LIZJ) != null) {
                if (!ForestExperiment.INSTANCE.getOptimizePrefixParser() || (c2027907wz = c1533560q0g.LJ) == null) {
                    synchronized (c1533560q0g) {
                        try {
                            List<String> list2 = c1533560q0g.LIZLLL;
                            if (list2 != null) {
                                arrayList2 = new ArrayList(list2);
                                arrayList2.addAll(arrayList3);
                            }
                            c1533560q0g.LIZLLL = arrayList2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } else {
                    c2027907wz.LIZIZ(arrayList3);
                }
            }
        }
        if (!LiveSubResourceMemoryCacheSettingSetting.INSTANCE.enable() || (c1533850q19 = (C1533850q19) C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "live")) == null) {
            return;
        }
        c1533850q19.LIZ.getConfig().LJIIJ = C1535170q3H.LIZIZ;
    }

    public static final synchronized void LIZIZ() {
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        C1533850q19 c1533850q19 = (C1533850q19) C1075530e5v.LIZIZ().LIZIZ(C1533850q19.class, "live");
        if (c1533850q19 == null || !Intrinsics.LJFF(c1533850q19.LIZLLL, "live")) {
            LIZ();
            LIZJ();
        }
    }

    public static void LIZJ() {
        C679960Qlm.LIZ("room_id", new InterfaceC1532940pzg() { // from class: X.0q3y
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                String idStr;
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room == null || (idStr = room.getIdStr()) == null) {
                    return "";
                }
                return idStr;
            }
        });
        C679960Qlm.LIZ("user_id", new InterfaceC1532940pzg() { // from class: X.14ep
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                return String.valueOf(UserService.getInstance().user().getCurrentUserId());
            }
        });
        C679960Qlm.LIZ("sec_user_id", new InterfaceC1532940pzg() { // from class: X.14eq
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                return UserService.getInstance().user().getCurrentUser().getSecUid();
            }
        });
        C679960Qlm.LIZ("anchor_id", new InterfaceC1532940pzg() { // from class: X.0q6E
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                User owner;
                String idStr;
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room == null || (owner = room.getOwner()) == null || (idStr = owner.getIdStr()) == null) {
                    return "";
                }
                return idStr;
            }
        });
        C679960Qlm.LIZ("sec_anchor_id", new InterfaceC1532940pzg() { // from class: X.0q6F
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                User owner;
                String secUid;
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
                    return "";
                }
                return secUid;
            }
        });
        C679960Qlm.LIZ("enter_method", new InterfaceC1532940pzg() { // from class: X.0q6G
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                w.LIZ.getClass();
                return w.LJIIL();
            }
        });
        C679960Qlm.LIZ("enter_from_merge", new InterfaceC1532940pzg() { // from class: X.0q6H
            @Override // X.InterfaceC1532940pzg
            public final String LIZ(InterfaceC679950Qll interfaceC679950Qll) {
                w.LIZ.getClass();
                return w.LJIIIZ();
            }
        });
    }
}
