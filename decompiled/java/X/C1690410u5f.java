package X;

/* JADX INFO: renamed from: X.0u5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690410u5f {
    public static final void LIZ(long j, EnumC1684030tvN enumC1684030tvN) {
        if (enumC1684030tvN == EnumC1684030tvN.Vertical) {
            if (C1682380tsi.LJII(j) == Integer.MAX_VALUE) {
                C1691080u6k.LIZJ("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else {
            if (C1682380tsi.LJIIIIZZ(j) != Integer.MAX_VALUE) {
                return;
            }
            C1691080u6k.LIZJ("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }
}
