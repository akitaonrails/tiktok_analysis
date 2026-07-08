package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HA2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HA2 extends C0DXR {
    public final Function0<Boolean> LL;
    public final Paint LLILLJJLI;
    public Integer LLILLL;

    public C0HA2(Function0<Boolean> function0) {
        this.LL = function0;
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setColor(-1);
        this.LLILLJJLI = paint;
    }

    public final void LJ(Canvas canvas, RecyclerView recyclerView) {
        canvas.drawRect(0.0f, 0.0f, recyclerView.getWidth(), recyclerView.getBottom(), this.LLILLJJLI);
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        List<InterfaceC1891350zJl> listItems;
        AbstractC677840QiM abstractC677840QiM;
        AbstractC677870QiP abstractC677870QiP;
        Integer numValueOf;
        AbstractC677840QiM abstractC677840QiM2;
        AbstractC677870QiP abstractC677870QiP2;
        Integer numValueOf2;
        int i;
        String str;
        Function0<Boolean> function0 = this.LL;
        if (function0 != null && !function0.invoke().booleanValue()) {
            return;
        }
        canvas.translate(-recyclerView.getScrollX(), -recyclerView.getScrollY());
        try {
            Integer num = this.LLILLL;
            if (num != null) {
                this.LLILLJJLI.setColor(num.intValue());
            } else {
                boolean zBooleanValue = ((Boolean) C134100fD.LIZ.getValue()).booleanValue();
                if (zBooleanValue) {
                    i = R.attr.zm;
                } else {
                    i = R.attr.bx;
                }
                Integer numLIZJ = C1308910kAL.LIZJ(i, recyclerView.getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    this.LLILLJJLI.setColor(iIntValue);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setupBackgroundColor: exp_enabled=");
                    sbLIZ.append(zBooleanValue);
                    sbLIZ.append(", use_color=");
                    if (zBooleanValue) {
                        str = "UIPageFlat1";
                    } else {
                        str = "BGPrimary";
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(", color_value=#");
                    sbLIZ.append(Integer.toHexString(iIntValue));
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, recyclerView.getContext());
            if (numLIZJ2 != null) {
                this.LLILLJJLI.setColor(numLIZJ2.intValue());
            }
        }
        if ((recyclerView instanceof C0HA4) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null && (listItems = viewOnAttachStateChangeListenerC20604515jv.getListItems()) != null && !listItems.isEmpty()) {
            if (!(listItems instanceof Collection) || !listItems.isEmpty()) {
                for (InterfaceC1891350zJl interfaceC1891350zJl : listItems) {
                    if ((interfaceC1891350zJl instanceof AbstractC677840QiM) && (abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl) != null && (abstractC677870QiP = abstractC677840QiM.LL) != null && (numValueOf = Integer.valueOf(abstractC677870QiP.LIZIZ)) != null && (numValueOf.intValue() == 10 || numValueOf.intValue() == 9)) {
                        int childCount = recyclerView.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            Object objLJJJLZIJ = C13LP.LJJJLZIJ(recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i2)), listItems);
                            if ((objLJJJLZIJ instanceof AbstractC677840QiM) && (abstractC677840QiM2 = (AbstractC677840QiM) objLJJJLZIJ) != null && (abstractC677870QiP2 = abstractC677840QiM2.LL) != null && (numValueOf2 = Integer.valueOf(abstractC677870QiP2.LIZIZ)) != null && (numValueOf2.intValue() == 10 || numValueOf2.intValue() == 9)) {
                                Float fValueOf = Float.valueOf(r3.getTop());
                                if (fValueOf != null) {
                                    canvas.drawRect(0.0f, fValueOf.floatValue(), recyclerView.getWidth(), recyclerView.getBottom(), this.LLILLJJLI);
                                    return;
                                }
                                LJ(canvas, recyclerView);
                                return;
                            }
                        }
                        LJ(canvas, recyclerView);
                        return;
                    }
                }
            }
            LJ(canvas, recyclerView);
            return;
        }
        LJ(canvas, recyclerView);
    }

    public final void LJFF(Context context, String str, String str2) {
        String strLIZ;
        try {
            if (str.length() > 0 && str2.length() > 0) {
                if (C960203pA.LIZIZ(context)) {
                    strLIZ = C2470009m6.LIZ(str2);
                } else {
                    strLIZ = C2470009m6.LIZ(str);
                }
                int color = Color.parseColor(strLIZ);
                this.LLILLL = Integer.valueOf(color);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setServerBgColor: isDarkMode=");
                sbLIZ.append(C960203pA.LIZIZ(context));
                sbLIZ.append(", color=#");
                sbLIZ.append(Integer.toHexString(color));
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL = null;
        }
    }
}
