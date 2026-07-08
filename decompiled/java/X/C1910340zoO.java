package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0zoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910340zoO extends C197039127h implements InterfaceC1910380zoS {
    public C1910340zoO(Context context) {
        super(context, null, 6, 0);
    }

    @Override // X.InterfaceC1910380zoS
    public void setNewIcon(int i) {
        setButtonStartIcon(Integer.valueOf(i));
        int iLIZJ = (int) C12ES.LIZJ(20.0f, getContext());
        setIconHeight(iLIZJ);
        setIconWidth(iLIZJ);
    }

    @Override // X.InterfaceC1910380zoS
    public final C1910340zoO LJIIIZ(String str, EnumC1910360zoQ enumC1910360zoQ) {
        setEnabled(true);
        setText(str);
        int i = C1910350zoP.LIZ[enumC1910360zoQ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                setButtonVariant(1);
            } else {
                throw new C1954807lC();
            }
        } else {
            setButtonVariant(0);
        }
        setButtonSize(3);
        return this;
    }
}
