package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1342610l2h {
    public static final EnumC1342610l2h CUSTOMIZE_LOADING;
    public static final EnumC1342610l2h DEFAULT;
    public static final EnumC1342610l2h HEADER_MATCH;
    public static final /* synthetic */ EnumC1342610l2h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1342610l2h LOAD_MORE;
    public static final EnumC1342610l2h MATCH_PARENT;
    public static final EnumC1342610l2h NORMAL_FOOTER;
    public static final EnumC1342610l2h TITLE_PANEL;
    public static final EnumC1342610l2h TITLE_PANEL_DESC_ONLY;
    public static final EnumC1342610l2h WARP_CONTENT;
    public int LL;

    public static InterfaceC2044707zh<EnumC1342610l2h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1342610l2h enumC1342610l2h = new EnumC1342610l2h(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 20);
        DEFAULT = enumC1342610l2h;
        EnumC1342610l2h enumC1342610l2h2 = new EnumC1342610l2h("MATCH_PARENT", 1, -1);
        MATCH_PARENT = enumC1342610l2h2;
        EnumC1342610l2h enumC1342610l2h3 = new EnumC1342610l2h("WARP_CONTENT", 2, -2);
        WARP_CONTENT = enumC1342610l2h3;
        EnumC1342610l2h enumC1342610l2h4 = new EnumC1342610l2h("HEADER_MATCH", 3, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        HEADER_MATCH = enumC1342610l2h4;
        EnumC1342610l2h enumC1342610l2h5 = new EnumC1342610l2h("NORMAL_FOOTER", 4, 52);
        NORMAL_FOOTER = enumC1342610l2h5;
        EnumC1342610l2h enumC1342610l2h6 = new EnumC1342610l2h("LOAD_MORE", 5, 52);
        LOAD_MORE = enumC1342610l2h6;
        EnumC1342610l2h enumC1342610l2h7 = new EnumC1342610l2h("CUSTOMIZE_LOADING", 6, -1);
        CUSTOMIZE_LOADING = enumC1342610l2h7;
        EnumC1342610l2h enumC1342610l2h8 = new EnumC1342610l2h("TITLE_PANEL", 7, 250);
        TITLE_PANEL = enumC1342610l2h8;
        EnumC1342610l2h enumC1342610l2h9 = new EnumC1342610l2h("TITLE_PANEL_DESC_ONLY", 8, 0);
        TITLE_PANEL_DESC_ONLY = enumC1342610l2h9;
        EnumC1342610l2h[] enumC1342610l2hArr = {enumC1342610l2h, enumC1342610l2h2, enumC1342610l2h3, enumC1342610l2h4, enumC1342610l2h5, enumC1342610l2h6, enumC1342610l2h7, enumC1342610l2h8, enumC1342610l2h9};
        LLILLJJLI = enumC1342610l2hArr;
        LLILLL = new C2254308sP(enumC1342610l2hArr);
    }

    public static EnumC1342610l2h[] values() {
        return (EnumC1342610l2h[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1342610l2h valueOf(String str) {
        return (EnumC1342610l2h) C08FF.LIZ(EnumC1342610l2h.class, str);
    }

    public final int pxValue(View view) {
        int i = C1342600l2g.LIZ[ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return C0HD5.LIZ(view, Integer.valueOf(this.LL));
        }
        return this.LL;
    }

    public final void setValue(int i) {
        this.LL = i;
    }

    public EnumC1342610l2h(String str, int i, int i2) {
        this.LL = i2;
    }
}
