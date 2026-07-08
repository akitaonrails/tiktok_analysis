package androidx.core.view.accessibility;

import X.C14M2;
import X.C19724712Fh;
import X.C20092313jV;
import X.C20092413jW;
import X.C20092513jX;
import X.C20092613jY;
import X.C20092913jb;
import X.C20093113jd;
import X.C20093213je;
import X.C2188811AlT;
import X.C786410Ut5;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes31.dex */
public class AccessibilityNodeInfoCompat {
    public static int sClickableSpanId;
    public final AccessibilityNodeInfo mInfo;
    public int mParentVirtualDescendantId = -1;
    public int mVirtualDescendantId = -1;

    public static String getActionSymbolicName(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case SpeechEngineDefines.ASR_WORK_MODE_OFFLINE /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case SpeechEngineDefines.TTS_WORK_MODE_BOTH /* 4096 */:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public void recycle() {
    }

    private void clearExtrasSpans() {
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.mInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private boolean hasSpans() {
        return !extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public boolean canOpenPopup() {
        return this.mInfo.canOpenPopup();
    }

    public List<C20092413jW> getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.mInfo.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C20092413jW(ListProtector.get(actionList, i), 0, null, null, null));
        }
        return arrayList;
    }

    public int getActions() {
        return this.mInfo.getActions();
    }

    public List<String> getAvailableExtraData() {
        return Build.VERSION.SDK_INT >= 26 ? this.mInfo.getAvailableExtraData() : Collections.emptyList();
    }

    public int getChildCount() {
        return this.mInfo.getChildCount();
    }

    public CharSequence getClassName() {
        return this.mInfo.getClassName();
    }

    public C20093113jd getCollectionInfo() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.mInfo.getCollectionInfo();
        if (collectionInfo != null) {
            return new C20093113jd(collectionInfo);
        }
        return null;
    }

    public C20092913jb getCollectionItemInfo() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.mInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new C20092913jb(collectionItemInfo);
        }
        return null;
    }

    public CharSequence getContainerTitle() {
        return Build.VERSION.SDK_INT >= 34 ? C20092513jX.LIZJ(this.mInfo) : this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public CharSequence getContentDescription() {
        return this.mInfo.getContentDescription();
    }

    public int getDrawingOrder() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mInfo.getDrawingOrder();
        }
        return 0;
    }

    public CharSequence getError() {
        return this.mInfo.getError();
    }

    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C20092613jY.LJ(this.mInfo);
        }
        return null;
    }

    public Bundle getExtras() {
        return this.mInfo.getExtras();
    }

    public CharSequence getHintText() {
        return Build.VERSION.SDK_INT >= 26 ? this.mInfo.getHintText() : this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public int getInputType() {
        return this.mInfo.getInputType();
    }

    public AccessibilityNodeInfoCompat getLabelFor() {
        return wrapNonNullInstance(this.mInfo.getLabelFor());
    }

    public AccessibilityNodeInfoCompat getLabeledBy() {
        return wrapNonNullInstance(this.mInfo.getLabeledBy());
    }

    public int getLiveRegion() {
        return this.mInfo.getLiveRegion();
    }

    public int getMaxTextLength() {
        return this.mInfo.getMaxTextLength();
    }

    public long getMinDurationBetweenContentChangesMillis() {
        return Build.VERSION.SDK_INT >= 34 ? C20092513jX.LIZLLL(this.mInfo) : this.mInfo.getExtras().getLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY");
    }

    public int getMovementGranularities() {
        return this.mInfo.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        return this.mInfo.getPackageName();
    }

    public CharSequence getPaneTitle() {
        return Build.VERSION.SDK_INT >= 28 ? this.mInfo.getPaneTitle() : this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
    }

    public AccessibilityNodeInfoCompat getParent() {
        return wrapNonNullInstance(this.mInfo.getParent());
    }

    public C19724712Fh getRangeInfo() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.mInfo.getRangeInfo();
        if (rangeInfo != null) {
            return new C19724712Fh(rangeInfo);
        }
        return null;
    }

    public CharSequence getRoleDescription() {
        return this.mInfo.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    public CharSequence getStateDescription() {
        return Build.VERSION.SDK_INT >= 30 ? C20092313jV.LIZIZ(this.mInfo) : this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public int getTextSelectionEnd() {
        return this.mInfo.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return this.mInfo.getTextSelectionStart();
    }

    public CharSequence getTooltipText() {
        return Build.VERSION.SDK_INT >= 28 ? this.mInfo.getTooltipText() : this.mInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public C20093213je getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.mInfo.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new C20093213je(touchDelegateInfo);
    }

    public AccessibilityNodeInfoCompat getTraversalAfter() {
        return wrapNonNullInstance(this.mInfo.getTraversalAfter());
    }

    public AccessibilityNodeInfoCompat getTraversalBefore() {
        return wrapNonNullInstance(this.mInfo.getTraversalBefore());
    }

    public String getUniqueId() {
        return Build.VERSION.SDK_INT >= 33 ? C20092613jY.LJI(this.mInfo) : this.mInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String getViewIdResourceName() {
        return this.mInfo.getViewIdResourceName();
    }

    public C14M2 getWindow() {
        AccessibilityWindowInfo window = this.mInfo.getWindow();
        if (window != null) {
            return new C14M2(window);
        }
        return null;
    }

    public int getWindowId() {
        return this.mInfo.getWindowId();
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        return Build.VERSION.SDK_INT >= 34 ? C20092513jX.LJ(this.mInfo) : getBooleanProperty(32);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return Build.VERSION.SDK_INT >= 34 ? C20092513jX.LJFF(this.mInfo) : getBooleanProperty(64);
    }

    public boolean isAccessibilityFocused() {
        return this.mInfo.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return this.mInfo.isCheckable();
    }

    public boolean isChecked() {
        return this.mInfo.isChecked();
    }

    public boolean isClickable() {
        return this.mInfo.isClickable();
    }

    public boolean isContentInvalid() {
        return this.mInfo.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.mInfo.isContextClickable();
    }

    public boolean isDismissable() {
        return this.mInfo.isDismissable();
    }

    public boolean isEditable() {
        return this.mInfo.isEditable();
    }

    public boolean isEnabled() {
        return this.mInfo.isEnabled();
    }

    public boolean isFocusable() {
        return this.mInfo.isFocusable();
    }

    public boolean isFocused() {
        return this.mInfo.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return getBooleanProperty(67108864);
    }

    public boolean isHeading() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.mInfo.isHeading();
        }
        if (getBooleanProperty(2)) {
            return true;
        }
        C20092913jb collectionItemInfo = getCollectionItemInfo();
        return collectionItemInfo != null && ((AccessibilityNodeInfo.CollectionItemInfo) collectionItemInfo.LIZ).isHeading();
    }

    public boolean isImportantForAccessibility() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mInfo.isImportantForAccessibility();
        }
        return true;
    }

    public boolean isLongClickable() {
        return this.mInfo.isLongClickable();
    }

    public boolean isMultiLine() {
        return this.mInfo.isMultiLine();
    }

    public boolean isPassword() {
        return this.mInfo.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return Build.VERSION.SDK_INT >= 28 ? this.mInfo.isScreenReaderFocusable() : getBooleanProperty(1);
    }

    public boolean isScrollable() {
        return this.mInfo.isScrollable();
    }

    public boolean isSelected() {
        return this.mInfo.isSelected();
    }

    public boolean isShowingHintText() {
        return Build.VERSION.SDK_INT >= 26 ? this.mInfo.isShowingHintText() : getBooleanProperty(4);
    }

    public boolean isTextEntryKey() {
        return Build.VERSION.SDK_INT >= 29 ? this.mInfo.isTextEntryKey() : getBooleanProperty(8);
    }

    public boolean isTextSelectable() {
        return Build.VERSION.SDK_INT >= 33 ? C20092613jY.LJII(this.mInfo) : getBooleanProperty(8388608);
    }

    public boolean isVisibleToUser() {
        return this.mInfo.isVisibleToUser();
    }

    public boolean refresh() {
        return this.mInfo.refresh();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("; boundsInParent: ");
        sbLIZ.append(rect);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        getBoundsInScreen(rect);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("; boundsInScreen: ");
        sbLIZ2.append(rect);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        getBoundsInWindow(rect);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("; boundsInWindow: ");
        sbLIZ3.append(rect);
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append("; packageName: ");
        sb.append(getPackageName());
        sb.append("; className: ");
        sb.append(getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(getError());
        sb.append("; maxTextLength: ");
        sb.append(getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(getUniqueId());
        sb.append("; checkable: ");
        sb.append(isCheckable());
        sb.append("; checked: ");
        sb.append(isChecked());
        sb.append("; focusable: ");
        sb.append(isFocusable());
        sb.append("; focused: ");
        sb.append(isFocused());
        sb.append("; selected: ");
        sb.append(isSelected());
        sb.append("; clickable: ");
        sb.append(isClickable());
        sb.append("; longClickable: ");
        sb.append(isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(isContextClickable());
        sb.append("; enabled: ");
        sb.append(isEnabled());
        sb.append("; password: ");
        sb.append(isPassword());
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("; scrollable: ");
        sbLIZ4.append(isScrollable());
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        sb.append("; containerTitle: ");
        sb.append(getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        sb.append(isGranularScrollingSupported());
        sb.append("; importantForAccessibility: ");
        sb.append(isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(isAccessibilityDataSensitive());
        sb.append("; [");
        List<C20092413jW> actionList = getActionList();
        for (int i = 0; i < actionList.size(); i++) {
            C20092413jW c20092413jW = (C20092413jW) ListProtector.get(actionList, i);
            String actionSymbolicName = getActionSymbolicName(c20092413jW.LIZ());
            if (actionSymbolicName.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) c20092413jW.LIZ).getLabel() != null) {
                actionSymbolicName = ((AccessibilityNodeInfo.AccessibilityAction) c20092413jW.LIZ).getLabel().toString();
            }
            sb.append(actionSymbolicName);
            if (i != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public static AccessibilityNodeInfoCompat obtain() {
        return wrap(AccessibilityNodeInfo.obtain());
    }

    public CharSequence getText() {
        if (!hasSpans()) {
            return this.mInfo.getText();
        }
        List<Integer> listExtrasIntList = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listExtrasIntList2 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listExtrasIntList3 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listExtrasIntList4 = extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.mInfo.getText(), 0, this.mInfo.getText().length()));
        for (int i = 0; i < listExtrasIntList.size(); i++) {
            final int iIntValue = ((Integer) ListProtector.get(listExtrasIntList4, i)).intValue();
            final int i2 = getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY");
            C786410Ut5.o2(spannableString, new ClickableSpan(this, iIntValue, i2) { // from class: X.13jZ
                public final int LL;
                public final AccessibilityNodeInfoCompat LLILLJJLI;
                public final int LLILLL;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.LL);
                    this.LLILLJJLI.performAction(this.LLILLL, bundle);
                }

                {
                    this.LL = iIntValue;
                    this.LLILLJJLI = this;
                    this.LLILLL = i2;
                }
            }, ((Integer) ListProtector.get(listExtrasIntList, i)).intValue(), ((Integer) ListProtector.get(listExtrasIntList2, i)).intValue(), ((Integer) ListProtector.get(listExtrasIntList3, i)).intValue());
        }
        return spannableString;
    }

    public Object getInfo() {
        return this.mInfo;
    }

    public AccessibilityNodeInfo unwrap() {
        return this.mInfo;
    }

    public AccessibilityNodeInfoCompat(Object obj) {
        this.mInfo = (AccessibilityNodeInfo) obj;
    }

    private List<Integer> extrasIntList(String str) {
        ArrayList<Integer> integerArrayList = this.mInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList arrayList = new ArrayList();
            C786410Ut5.LJJIJIL(this.mInfo.getExtras(), str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private boolean getBooleanProperty(int i) {
        Bundle extras = getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> getOrCreateSpansFromViewTags(View view) {
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(com.zhiliaoapp.musically.R.id.x0x, sparseArray);
            return sparseArray;
        }
        return spansFromViewTags;
    }

    private SparseArray<WeakReference<ClickableSpan>> getSpansFromViewTags(View view) {
        return (SparseArray) view.getTag(com.zhiliaoapp.musically.R.id.x0x);
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrap(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.mInfo));
    }

    private void removeCollectedSpans(View view) {
        SparseArray<WeakReference<ClickableSpan>> spansFromViewTags = getSpansFromViewTags(view);
        if (spansFromViewTags != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < spansFromViewTags.size(); i++) {
                if (spansFromViewTags.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                spansFromViewTags.remove(((Integer) ListProtector.get(arrayList, i2)).intValue());
            }
        }
    }

    public static AccessibilityNodeInfoCompat wrap(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj) {
        if (obj != null) {
            return new AccessibilityNodeInfoCompat(obj);
        }
        return null;
    }

    public void addAction(C20092413jW c20092413jW) {
        this.mInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) c20092413jW.LIZ);
    }

    public void addChild(View view) {
        this.mInfo.addChild(view);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.mInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.mInfo)) {
            return false;
        }
        if (this.mVirtualDescendantId == accessibilityNodeInfoCompat.mVirtualDescendantId && this.mParentVirtualDescendantId == accessibilityNodeInfoCompat.mParentVirtualDescendantId) {
            return true;
        }
        return false;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.mInfo.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(wrap((AccessibilityNodeInfo) ListProtector.get(listFindAccessibilityNodeInfosByText, i)));
        }
        return arrayList;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.mInfo.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it2 = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it2.hasNext()) {
            arrayList.add(wrap(it2.next()));
        }
        return arrayList;
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        return wrapNonNullInstance(this.mInfo.findFocus(i));
    }

    public AccessibilityNodeInfoCompat focusSearch(int i) {
        return wrapNonNullInstance(this.mInfo.focusSearch(i));
    }

    public void getBoundsInParent(Rect rect) {
        this.mInfo.getBoundsInParent(rect);
    }

    public void getBoundsInScreen(Rect rect) {
        this.mInfo.getBoundsInScreen(rect);
    }

    public void getBoundsInWindow(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20092513jX.LIZIZ(this.mInfo, rect);
            return;
        }
        Rect rect2 = (Rect) this.mInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 == null) {
            return;
        }
        rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
    }

    public AccessibilityNodeInfoCompat getChild(int i) {
        return wrapNonNullInstance(this.mInfo.getChild(i));
    }

    public AccessibilityNodeInfoCompat getParent(int i) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C20092613jY.LJFF(this.mInfo, i);
        }
        return getParent();
    }

    public boolean performAction(int i) {
        return this.mInfo.performAction(i);
    }

    public boolean removeAction(C20092413jW c20092413jW) {
        return this.mInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c20092413jW.LIZ);
    }

    public boolean removeChild(View view) {
        return this.mInfo.removeChild(view);
    }

    public void setAccessibilityDataSensitive(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20092513jX.LJI(this.mInfo, z);
        } else {
            setBooleanProperty(64, z);
        }
    }

    public void setAccessibilityFocused(boolean z) {
        this.mInfo.setAccessibilityFocused(z);
    }

    public void setAvailableExtraData(List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setAvailableExtraData(list);
        }
    }

    public void setBoundsInParent(Rect rect) {
        this.mInfo.setBoundsInParent(rect);
    }

    public void setBoundsInScreen(Rect rect) {
        this.mInfo.setBoundsInScreen(rect);
    }

    public void setBoundsInWindow(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20092513jX.LJII(this.mInfo, rect);
        } else {
            C786410Ut5.LJJIJL(this.mInfo.getExtras(), "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect);
        }
    }

    public void setCanOpenPopup(boolean z) {
        this.mInfo.setCanOpenPopup(z);
    }

    public void setCheckable(boolean z) {
        this.mInfo.setCheckable(z);
    }

    public void setChecked(boolean z) {
        this.mInfo.setChecked(z);
    }

    public void setClassName(CharSequence charSequence) {
        this.mInfo.setClassName(charSequence);
    }

    public void setClickable(boolean z) {
        this.mInfo.setClickable(z);
    }

    public void setCollectionInfo(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C20093113jd) obj).LIZ;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void setCollectionItemInfo(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.mInfo;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C20092913jb) obj).LIZ;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    public void setContainerTitle(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20092513jX.LJIIIIZZ(this.mInfo, charSequence);
        } else {
            C786410Ut5.LJJIJIIJI(this.mInfo.getExtras(), "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.mInfo.setContentDescription(charSequence);
    }

    public void setContentInvalid(boolean z) {
        this.mInfo.setContentInvalid(z);
    }

    public void setContextClickable(boolean z) {
        this.mInfo.setContextClickable(z);
    }

    public void setDismissable(boolean z) {
        this.mInfo.setDismissable(z);
    }

    public void setDrawingOrder(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mInfo.setDrawingOrder(i);
        }
    }

    public void setEditable(boolean z) {
        this.mInfo.setEditable(z);
    }

    public void setEnabled(boolean z) {
        this.mInfo.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        this.mInfo.setError(charSequence);
    }

    public void setFocusable(boolean z) {
        this.mInfo.setFocusable(z);
    }

    public void setFocused(boolean z) {
        this.mInfo.setFocused(z);
    }

    public void setGranularScrollingSupported(boolean z) {
        setBooleanProperty(67108864, z);
    }

    public void setHeading(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setHeading(z);
        } else {
            setBooleanProperty(2, z);
        }
    }

    public void setHintText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setHintText(charSequence);
        } else {
            C786410Ut5.LJJIJIIJI(this.mInfo.getExtras(), "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void setImportantForAccessibility(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mInfo.setImportantForAccessibility(z);
        }
    }

    public void setInputType(int i) {
        this.mInfo.setInputType(i);
    }

    public void setLabelFor(View view) {
        this.mInfo.setLabelFor(view);
    }

    public void setLabeledBy(View view) {
        this.mInfo.setLabeledBy(view);
    }

    public void setLiveRegion(int i) {
        this.mInfo.setLiveRegion(i);
    }

    public void setLongClickable(boolean z) {
        this.mInfo.setLongClickable(z);
    }

    public void setMaxTextLength(int i) {
        this.mInfo.setMaxTextLength(i);
    }

    public void setMinDurationBetweenContentChangesMillis(long j) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20092513jX.LJIIIZ(this.mInfo, j);
        } else {
            this.mInfo.getExtras().putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", j);
        }
    }

    public void setMovementGranularities(int i) {
        this.mInfo.setMovementGranularities(i);
    }

    public void setMultiLine(boolean z) {
        this.mInfo.setMultiLine(z);
    }

    public void setPackageName(CharSequence charSequence) {
        this.mInfo.setPackageName(charSequence);
    }

    public void setPaneTitle(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setPaneTitle(charSequence);
        } else {
            C786410Ut5.LJJIJIIJI(this.mInfo.getExtras(), "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void setParent(View view) {
        this.mParentVirtualDescendantId = -1;
        this.mInfo.setParent(view);
    }

    public void setPassword(boolean z) {
        this.mInfo.setPassword(z);
    }

    public void setRangeInfo(C19724712Fh c19724712Fh) {
        this.mInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c19724712Fh.LIZ);
    }

    public void setRequestInitialAccessibilityFocus(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20092513jX.LJIIJJI(this.mInfo, z);
        } else {
            setBooleanProperty(32, z);
        }
    }

    public void setRoleDescription(CharSequence charSequence) {
        C786410Ut5.LJJIJIIJI(this.mInfo.getExtras(), "AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void setScreenReaderFocusable(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setScreenReaderFocusable(z);
        } else {
            setBooleanProperty(1, z);
        }
    }

    public void setScrollable(boolean z) {
        this.mInfo.setScrollable(z);
    }

    public void setSelected(boolean z) {
        this.mInfo.setSelected(z);
    }

    public void setShowingHintText(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mInfo.setShowingHintText(z);
        } else {
            setBooleanProperty(4, z);
        }
    }

    public void setSource(View view) {
        this.mVirtualDescendantId = -1;
        this.mInfo.setSource(view);
    }

    public void setStateDescription(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C20092313jV.LIZJ(this.mInfo, charSequence);
        } else {
            C786410Ut5.LJJIJIIJI(this.mInfo.getExtras(), "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void setText(CharSequence charSequence) {
        this.mInfo.setText(charSequence);
    }

    public void setTextEntryKey(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.mInfo.setTextEntryKey(z);
        } else {
            setBooleanProperty(8, z);
        }
    }

    public void setTextSelectable(boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            C20092613jY.LJIIIIZZ(this.mInfo, z);
        } else {
            setBooleanProperty(8388608, z);
        }
    }

    public void setTooltipText(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mInfo.setTooltipText(charSequence);
        } else {
            C786410Ut5.LJJIJIIJI(this.mInfo.getExtras(), "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void setTouchDelegateInfo(C20093213je c20093213je) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.mInfo.setTouchDelegateInfo(c20093213je.LIZ);
        }
    }

    public void setTraversalAfter(View view) {
        this.mInfo.setTraversalAfter(view);
    }

    public void setTraversalBefore(View view) {
        this.mInfo.setTraversalBefore(view);
    }

    public void setUniqueId(String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            C20092613jY.LJIIIZ(this.mInfo, str);
        } else {
            C786410Ut5.LJJJI("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", str, this.mInfo.getExtras());
        }
    }

    public void setViewIdResourceName(String str) {
        this.mInfo.setViewIdResourceName(str);
    }

    public void setVisibleToUser(boolean z) {
        this.mInfo.setVisibleToUser(z);
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.mInfo = accessibilityNodeInfo;
    }

    public static AccessibilityNodeInfoCompat obtain(View view) {
        return wrap(AccessibilityNodeInfo.obtain(view));
    }

    public void addAction(int i) {
        this.mInfo.addAction(i);
    }

    private int idForClickableSpan(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = sClickableSpanId;
        sClickableSpanId = i2 + 1;
        return i2;
    }

    public static AccessibilityNodeInfoCompat obtain(View view, int i) {
        return wrapNonNullInstance(AccessibilityNodeInfo.obtain(view, i));
    }

    private void setBooleanProperty(int i, boolean z) {
        Bundle extras = getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void addChild(View view, int i) {
        this.mInfo.addChild(view, i);
    }

    public void addSpansToExtras(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            clearExtrasSpans();
            removeCollectedSpans(view);
            ClickableSpan[] clickableSpans = getClickableSpans(charSequence);
            if (clickableSpans != null && clickableSpans.length > 0) {
                getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", com.zhiliaoapp.musically.R.id.zg);
                SparseArray<WeakReference<ClickableSpan>> orCreateSpansFromViewTags = getOrCreateSpansFromViewTags(view);
                for (int i = 0; i < clickableSpans.length; i++) {
                    int iIdForClickableSpan = idForClickableSpan(clickableSpans[i], orCreateSpansFromViewTags);
                    orCreateSpansFromViewTags.put(iIdForClickableSpan, new WeakReference<>(clickableSpans[i]));
                    addSpanLocationToExtras(clickableSpans[i], (Spanned) charSequence, iIdForClickableSpan);
                }
            }
        }
    }

    public AccessibilityNodeInfoCompat getChild(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 33) {
            return C20092613jY.LIZIZ(this.mInfo, i, i2);
        }
        return getChild(i);
    }

    public boolean performAction(int i, Bundle bundle) {
        return this.mInfo.performAction(i, bundle);
    }

    public boolean removeChild(View view, int i) {
        return this.mInfo.removeChild(view, i);
    }

    public void setLabelFor(View view, int i) {
        this.mInfo.setLabelFor(view, i);
    }

    public void setLabeledBy(View view, int i) {
        this.mInfo.setLabeledBy(view, i);
    }

    public void setParent(View view, int i) {
        this.mParentVirtualDescendantId = i;
        this.mInfo.setParent(view, i);
    }

    public void setQueryFromAppProcessEnabled(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20092513jX.LJIIJ(this.mInfo, view, z);
        }
    }

    public void setSource(View view, int i) {
        this.mVirtualDescendantId = i;
        this.mInfo.setSource(view, i);
    }

    public void setTextSelection(int i, int i2) {
        this.mInfo.setTextSelection(i, i2);
    }

    public void setTraversalAfter(View view, int i) {
        this.mInfo.setTraversalAfter(view, i);
    }

    public void setTraversalBefore(View view, int i) {
        this.mInfo.setTraversalBefore(view, i);
    }

    private void addSpanLocationToExtras(ClickableSpan clickableSpan, Spanned spanned, int i) {
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        extrasIntList("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }
}
