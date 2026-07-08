package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1734806qo extends LinearLayout implements C06OA {
    public final /* synthetic */ C06ME LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    private final TuxTextView getSugOption1FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wnn);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getSugOption2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wno);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getSugOption3FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wnp);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getSugOptionsHeaderForXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wnq);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxIconView getSugOptionsQuitMarkFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wnr);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public C1734806qo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C06ME();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zm);
        C1546210qL5.LIZ.getClass();
        c384050F3z.LIZJ = Float.valueOf(C1546210qL5.LIZ(20));
        List listLJIIJJI = C1697810uHb.LJIIJJI(getSugOption1FromXml(), getSugOption2FromXml(), getSugOption3FromXml());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setBackground(c384050F3z.LIZ(context));
        }
    }

    public static void LIZIZ(TuxTextView tuxTextView, final InterfaceC1735006qq interfaceC1735006qq, final Function2 function2, final int i) {
        tuxTextView.setText(interfaceC1735006qq.LIZ());
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        C786410Ut5.h9(tuxTextView, new View.OnClickListener() { // from class: X.06qp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function2.invoke(interfaceC1735006qq, Integer.valueOf(i));
            }
        });
    }

    public final void LIZ(List<? extends InterfaceC1735006qq> list, String str, Function2<? super InterfaceC1735006qq, ? super Integer, Unit> function2, Function0<Unit> function0) {
        InterfaceC1735006qq interfaceC1735006qq = (InterfaceC1735006qq) C13LP.LJJJLZIJ(0, list);
        if (interfaceC1735006qq != null) {
            LIZIZ(getSugOption1FromXml(), interfaceC1735006qq, function2, 1);
        }
        InterfaceC1735006qq interfaceC1735006qq2 = (InterfaceC1735006qq) C13LP.LJJJLZIJ(1, list);
        if (interfaceC1735006qq2 != null) {
            LIZIZ(getSugOption2FromXml(), interfaceC1735006qq2, function2, 2);
        }
        InterfaceC1735006qq interfaceC1735006qq3 = (InterfaceC1735006qq) C13LP.LJJJLZIJ(2, list);
        if (interfaceC1735006qq3 != null) {
            LIZIZ(getSugOption3FromXml(), interfaceC1735006qq3, function2, 3);
        }
        C786410Ut5.a9(getSugOptionsQuitMarkFromXml(), new ACListenerS137S0100000_2(function0, 26));
        TuxTextView sugOptionsHeaderForXml = getSugOptionsHeaderForXml();
        if (sugOptionsHeaderForXml != null) {
            sugOptionsHeaderForXml.setText(str);
        }
    }
}
