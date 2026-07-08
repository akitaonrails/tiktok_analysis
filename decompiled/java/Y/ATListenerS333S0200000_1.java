package Y;

import X.C03O0;
import X.C044M;
import X.C0I7D;
import X.C10510049c;
import X.C1748720vbi;
import X.C2097908Jt;
import X.C817403Hg;
import X.C939603lq;
import X.C939703lr;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuCounterReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelCounterWidget;
import kotlin.Pair;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public class ATListenerS333S0200000_1 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS333S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(ATListenerS333S0200000_1 aTListenerS333S0200000_1, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float f = ((C817403Hg) aTListenerS333S0200000_1.l0).element;
                if (x - f > 0.0f && f != 0.0f) {
                    USAddonOrderCell uSAddonOrderCell = (USAddonOrderCell) aTListenerS333S0200000_1.l1;
                    if (!uSAddonOrderCell.LLJJJ) {
                        C03O0.LJJJJL(C03O0.LIZ, "less", uSAddonOrderCell.LLJLILLLLZIIL);
                    } else {
                        uSAddonOrderCell.U5("tiktokec_module_glide", C2097908Jt.LIZJ(new Pair("glide_type", "less")));
                    }
                } else {
                    USAddonOrderCell uSAddonOrderCell2 = (USAddonOrderCell) aTListenerS333S0200000_1.l1;
                    if (!uSAddonOrderCell2.LLJJJ) {
                        C03O0.LJJJJL(C03O0.LIZ, "more", uSAddonOrderCell2.LLJLILLLLZIIL);
                    } else {
                        uSAddonOrderCell2.U5("tiktokec_module_glide", C2097908Jt.LIZJ(new Pair("glide_type", "more")));
                    }
                }
                ((C817403Hg) aTListenerS333S0200000_1.l0).element = motionEvent.getX();
            }
        } else {
            ((C817403Hg) aTListenerS333S0200000_1.l0).element = motionEvent.getX();
            USAddonOrderCell uSAddonOrderCell3 = (USAddonOrderCell) aTListenerS333S0200000_1.l1;
            if (!uSAddonOrderCell3.LLJLIL) {
                uSAddonOrderCell3.LLJLIL = true;
                uSAddonOrderCell3.LLJJLIIIJLLLLLLLZ.postDelayed(uSAddonOrderCell3.LLJL, 1000L);
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS333S0200000_1 aTListenerS333S0200000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditText editText = (EditText) aTListenerS333S0200000_1.l0;
            HandlerHook.viewPost(editText, new ARunnableS101S0100000_1((Object) editText, 25));
            C1748720vbi.LIZLLL((EditText) aTListenerS333S0200000_1.l0, new C10510049c(), new AwS580S0100000_1((SkuPanelCounterWidget) aTListenerS333S0200000_1.l1, 297));
            ((SkuPanelCounterWidget) aTListenerS333S0200000_1.l1).LLJJ = SystemClock.elapsedRealtime();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS333S0200000_1 aTListenerS333S0200000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditText editText = (EditText) aTListenerS333S0200000_1.l0;
            HandlerHook.viewPost(editText, new ARunnableS101S0100000_1((Object) editText, 47));
            C1748720vbi.LIZLLL((EditText) aTListenerS333S0200000_1.l0, new C10510049c(), new AwS580S0100000_1((C044M) aTListenerS333S0200000_1.l1, 561));
            ((SkuCounterReusedAssem) ((C044M) aTListenerS333S0200000_1.l1)).LLJZ = SystemClock.elapsedRealtime();
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033a  */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r33v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SnsInfo] */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r39v1, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$3(Y.ATListenerS333S0200000_1 r65, android.view.View r66, android.view.MotionEvent r67) {
        /*
            Method dump skipped, instruction units count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS333S0200000_1.onTouch$3(Y.ATListenerS333S0200000_1, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$4(ATListenerS333S0200000_1 aTListenerS333S0200000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C939603lq c939603lq = (C939603lq) aTListenerS333S0200000_1.l0;
            c939603lq.LLJILLL.invoke(c939603lq);
            C0I7D c0i7d = (C0I7D) aTListenerS333S0200000_1.l1;
            HandlerHook.viewPost(c0i7d, new ARunnableS101S0100000_1((Object) c0i7d, 60));
            C1748720vbi.LIZLLL((C0I7D) aTListenerS333S0200000_1.l1, new C10510049c(), new AwS580S0100000_1((C939603lq) aTListenerS333S0200000_1.l0, 765));
            ((C939603lq) aTListenerS333S0200000_1.l0).LLJJ = SystemClock.elapsedRealtime();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$5(ATListenerS333S0200000_1 aTListenerS333S0200000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C939703lr c939703lr = (C939703lr) aTListenerS333S0200000_1.l0;
            c939703lr.LLJILJILJ.invoke(c939703lr);
            C0I7D c0i7d = (C0I7D) aTListenerS333S0200000_1.l1;
            HandlerHook.viewPost(c0i7d, new ARunnableS101S0100000_1((Object) c0i7d, 61));
            C1748720vbi.LIZLLL((C0I7D) aTListenerS333S0200000_1.l1, new C10510049c(), new AwS580S0100000_1((C939703lr) aTListenerS333S0200000_1.l0, 767));
            ((C939703lr) aTListenerS333S0200000_1.l0).LLJILLL = SystemClock.elapsedRealtime();
            return false;
        }
        return false;
    }
}
