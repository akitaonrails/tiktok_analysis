package X;

/* JADX INFO: renamed from: X.0kJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1314690kJf extends C1299030juP {
    public String LLLLZI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UIComponent{width=");
        sbLIZ.append(this.LLJJJIL);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LLJJJJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
    public final void LJJLIIIJJIZ() {
        super.LJJLIIIJJIZ();
    }

    public C1314690kJf(AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
    }

    @Override // X.C1299030juP
    public final C1313680kI2 LJZ(final AbstractC1317090kNX abstractC1317090kNX) {
        return new C1313680kI2(abstractC1317090kNX) { // from class: X.0kJe
            public int LLILZ;

            public int getPosition() {
                return this.LLILZ;
            }

            public void setPosition(int i) {
                this.LLILZ = i;
            }
        };
    }

    @InterfaceC1291270jht(name = "item-key")
    public void setItemKey(String str) {
        this.LLLLZI = str;
    }
}
