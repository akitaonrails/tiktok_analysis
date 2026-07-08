package X;

/* JADX INFO: renamed from: X.0kKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1315190kKT implements Runnable {
    public final float LL;
    public final float LLILLJJLI;
    public final /* synthetic */ ActionModeCallbackC1315180kKS LLILLL;

    public final void LIZ() {
        int offsetForPosition = this.LLILLL.getOffsetForPosition(this.LL, this.LLILLJJLI);
        if (offsetForPosition < 0) {
            this.LLILLL.mCheckForLongPress = null;
            return;
        }
        ActionModeCallbackC1315180kKS actionModeCallbackC1315180kKS = this.LLILLL;
        actionModeCallbackC1315180kKS.mIsInSelection = true;
        actionModeCallbackC1315180kKS.mSelectStartPos.set(this.LL, this.LLILLJJLI);
        this.LLILLL.mSelectEndPos.set(this.LL, this.LLILLJJLI);
        ActionModeCallbackC1315180kKS actionModeCallbackC1315180kKS2 = this.LLILLL;
        actionModeCallbackC1315180kKS2.mSelectStart = offsetForPosition;
        actionModeCallbackC1315180kKS2.mSelectEnd = offsetForPosition;
        actionModeCallbackC1315180kKS2.mIsAdjustEndPos = true;
        actionModeCallbackC1315180kKS2.requestDisallowInterceptTouchEvent(true);
        this.LLILLL.mCheckForLongPress = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AndroidText$CheckForLongPress@5627.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AndroidText$CheckForLongPress@5627.run");
    }

    public RunnableC1315190kKT(ActionModeCallbackC1315180kKS actionModeCallbackC1315180kKS, float f, float f2) {
        this.LLILLL = actionModeCallbackC1315180kKS;
        this.LL = f;
        this.LLILLJJLI = f2;
    }
}
