package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.19qL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21663519qL extends TuxTextView implements InterfaceC21663619qM {
    public C21663519qL(Context context) {
        super(context, null, 6, 0);
    }

    @Override // X.InterfaceC21663619qM
    public void setNewColor(int i) {
        setTextColor(i);
    }

    public void setNewValue(String str) {
        setText(str);
    }

    @Override // X.InterfaceC21663619qM
    public final C21663519qL LJI(String str, EnumC21663819qO enumC21663819qO) {
        int i;
        setText(str);
        switch (C21663719qN.LIZ[enumC21663819qO.ordinal()]) {
            case 1:
                i = 23;
                break;
            case 2:
                i = 33;
                break;
            case 3:
                i = 101;
                break;
            case 4:
                i = 41;
                break;
            case 5:
                i = 42;
                break;
            case 6:
                i = 71;
                break;
            default:
                throw new C1954807lC();
        }
        setTuxFont(i);
        return this;
    }
}
