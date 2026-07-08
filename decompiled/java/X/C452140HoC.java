package X;

import Y.AsS33S0100000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.comment.sticker.typing.TypingStickerPowerCell;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452140HoC extends FrameLayout {
    public final ViewOnAttachStateChangeListenerC20604515jv LL;
    public Function2<? super StickerItem, ? super Integer, Unit> LLILLJJLI;
    public final Set<String> LLILLL;
    public boolean LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452140HoC.LIZ():void");
    }

    public final List<StickerItem> getData() {
        C452150HoD c452150HoD;
        StickerItem stickerItem;
        List<InterfaceC1891350zJl> listItems = this.LL.getListItems();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : listItems) {
            if ((interfaceC1891350zJl instanceof C452150HoD) && (c452150HoD = (C452150HoD) interfaceC1891350zJl) != null && (stickerItem = c452150HoD.LL) != null) {
                arrayList.add(stickerItem);
            }
        }
        return arrayList;
    }

    public final void setOnStickerClickListener(Function2<? super StickerItem, ? super Integer, Unit> function2) {
        this.LLILLJJLI = function2;
    }

    public C452140HoC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(context, null);
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, new FrameLayout.LayoutParams(-1, -2));
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new LinearLayoutManager(context, 0, false));
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TypingStickerPowerCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
        viewOnAttachStateChangeListenerC20604515jv.setClipToPadding(false);
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        this.LLILLL = new LinkedHashSet();
        addView(viewOnAttachStateChangeListenerC20604515jv);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS33S0100000_6(this, 9));
    }
}
