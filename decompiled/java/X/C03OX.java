package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03OX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OX {
    public static final C03OX ADDRESS_EDIT;
    public static final C03OX ADD_CCDC;
    public static final C03OX DEFAULT;
    public static final /* synthetic */ C03OX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03OX ORDER_SUBMIT;
    public static final C03OX TOTAL;
    public final int LL;

    public static InterfaceC2044707zh<C03OX> getEntries() {
        return LLILLL;
    }

    static {
        C03OX c03ox = new C03OX(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -999);
        DEFAULT = c03ox;
        C03OX c03ox2 = new C03OX("TOTAL", 1, 1);
        TOTAL = c03ox2;
        C03OX c03ox3 = new C03OX("ORDER_SUBMIT", 2, 2);
        ORDER_SUBMIT = c03ox3;
        C03OX c03ox4 = new C03OX("ADDRESS_EDIT", 3, 3);
        ADDRESS_EDIT = c03ox4;
        C03OX c03ox5 = new C03OX("ADD_CCDC", 4, 4);
        ADD_CCDC = c03ox5;
        C03OX[] c03oxArr = {c03ox, c03ox2, c03ox3, c03ox4, c03ox5};
        LLILLJJLI = c03oxArr;
        LLILLL = new C2254308sP(c03oxArr);
    }

    public static C03OX[] values() {
        return (C03OX[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static C03OX valueOf(String str) {
        return (C03OX) C08FF.LIZ(C03OX.class, str);
    }

    public C03OX(String str, int i, int i2) {
        this.LL = i2;
    }
}
