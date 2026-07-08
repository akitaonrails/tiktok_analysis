package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;

/* JADX INFO: renamed from: X.10QB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10QB {
    public static C10SX LIZ(IPluginService.PluginData pluginData) {
        C10Q6 c10q6 = EnumC19241510Pl.Companion;
        int i = pluginData.id;
        c10q6.getClass();
        EnumC19241510Pl enumC19241510Pl = EnumC19241510Pl.pluginMap.get(Integer.valueOf(i));
        if (enumC19241510Pl == null) {
            return null;
        }
        return new C10SX(enumC19241510Pl, pluginData);
    }
}
