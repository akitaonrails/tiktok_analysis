package X;

import android.graphics.Matrix;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kEi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1311620kEi extends ClickableSpan implements InterfaceC1311410kEN {
    public final int LL;
    public int LLILLJJLI;
    public WeakReference<InterfaceC1311410kEN> LLILLL;
    public final Map<String, C1299120juY> LLILZ;
    public final EnumC1311650kEl LLILZIL;
    public final EnumC1311650kEl LLILZLL;
    public final EnumC1311640kEk LLIZ;
    public final ReadableMap LLIZLLLIL;
    public final boolean LLJ;

    @Override // X.InterfaceC1311410kEN
    public final boolean blockNativeEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean consumeSlideEvent(float f) {
        return false;
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean dispatchEvent(C1299240juk c1299240juk) {
        return false;
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean dispatchTouch(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC1311410kEN
    public final HashMap<String, InterfaceC1311410kEN> getChildrenLynxPageUI() {
        return null;
    }

    @Override // X.InterfaceC1311410kEN
    public final int getGestureArenaMemberId() {
        return 0;
    }

    @Override // X.InterfaceC1311410kEN
    public final InterfaceC1311410kEN getParentLynxPageUI() {
        return null;
    }

    @Override // X.InterfaceC1311410kEN
    public final InterfaceC1311410kEN getRootLynxPageUI() {
        return null;
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean hasConsumeSlideEventAngles() {
        return false;
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean isFocusable() {
        return false;
    }

    @Override // X.InterfaceC1311410kEN
    public final void offResponseChain() {
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void onEventBubble(boolean z, long j) {
        throw null;
    }

    @Override // X.InterfaceC1311410kEN
    public final void onEventCapture(boolean z, long j) {
        throw null;
    }

    @Override // X.InterfaceC1311410kEN
    public final void onEventFire(boolean z, long j) {
        throw null;
    }

    @Override // X.InterfaceC1311410kEN
    public final void onFocusChanged(boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void onResponseChain() {
    }

    @Override // X.InterfaceC1311410kEN
    public final void setEventID(long j) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void setPanInterceptAncestors(boolean z) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void setPanInterceptDescendants(boolean z) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void setPanInterceptSelf(boolean z) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void startEventBubble(long j) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void startEventCapture(long j) {
    }

    @Override // X.InterfaceC1311410kEN
    public final void startEventFire(boolean z, long j) {
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean ignoreFocus() {
        EnumC1311650kEl enumC1311650kEl = this.LLILZIL;
        if (enumC1311650kEl == EnumC1311650kEl.Enable) {
            return true;
        }
        if (enumC1311650kEl == EnumC1311650kEl.Disable || parent() == null) {
            return false;
        }
        return parent().ignoreFocus();
    }

    @Override // X.InterfaceC1311410kEN
    public final InterfaceC1311410kEN parent() {
        return this.LLILLL.get();
    }

    @Override // X.InterfaceC1326530kcl
    public final InterfaceC1326530kcl parentResponder() {
        WeakReference<InterfaceC1311410kEN> weakReference = this.LLILLL;
        if (weakReference instanceof InterfaceC1326530kcl) {
            return weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC1311410kEN
    public final EnumC1311640kEk pointerEvents() {
        EnumC1311640kEk enumC1311640kEk = this.LLIZ;
        return enumC1311640kEk != EnumC1311640kEk.Unset ? enumC1311640kEk : parent() != null ? parent().pointerEvents() : EnumC1311640kEk.Auto;
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean enableTouchPseudoPropagation() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1326530kcl
    public final ReadableMap getDataset() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1311410kEN
    public final Map<String, C1299120juY> getEvents() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1311410kEN
    public final int getPseudoStatus() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1311410kEN
    public final int getSign() {
        return this.LL;
    }

    @Override // X.InterfaceC1311410kEN
    public final EnumC1311610kEh panInterceptDirection() {
        return EnumC1311610kEh.None;
    }

    @Override // X.InterfaceC1311410kEN
    public final EnumC1314040kIc panInterceptScope() {
        return EnumC1314040kIc.None;
    }

    @Override // X.InterfaceC1311410kEN
    public final boolean eventThrough(float f, float f2) {
        InterfaceC1311410kEN interfaceC1311410kENParent;
        EnumC1311650kEl enumC1311650kEl = this.LLILZLL;
        if (enumC1311650kEl == EnumC1311650kEl.Enable) {
            return true;
        }
        if (enumC1311650kEl == EnumC1311650kEl.Disable || (interfaceC1311410kENParent = parent()) == null) {
            return false;
        }
        return interfaceC1311410kENParent.eventThrough(f, f2);
    }

    @Override // X.InterfaceC1311410kEN
    public final void onPseudoStatusChanged(int i, int i2) {
        this.LLILLJJLI = i2;
    }

    public C1311620kEi(int i, Map<String, C1299120juY> map, EnumC1311650kEl enumC1311650kEl, boolean z, EnumC1311650kEl enumC1311650kEl2, EnumC1311640kEk enumC1311640kEk, ReadableMap readableMap) {
        this.LLIZLLLIL = new JavaOnlyMap();
        new Matrix();
        this.LL = i;
        this.LLILLL = null;
        this.LLILZIL = enumC1311650kEl;
        this.LLILZLL = enumC1311650kEl2;
        this.LLIZ = enumC1311640kEk;
        this.LLIZLLLIL = readableMap;
        this.LLJ = z;
        if (map != null) {
            HashMap map2 = new HashMap();
            this.LLILZ = map2;
            map2.putAll(map);
            return;
        }
        this.LLILZ = null;
    }
}
