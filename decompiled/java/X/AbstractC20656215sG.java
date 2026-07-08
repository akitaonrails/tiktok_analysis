package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.15sG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20656215sG implements InterfaceC20660515sx {
    public String elementLabel;
    public final InterfaceC20658015sY scene;
    public final C20656615sK stateWrapper;
    public String triggerId;

    public boolean canShow() {
        return true;
    }

    public boolean enableDuplication() {
        return false;
    }

    public String getPopupEnterFrom() {
        return "";
    }

    public C0T87 getPopupExtraParams() {
        return null;
    }

    public void onConflict() {
    }

    public void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
    }

    public void showPopupFailed(int i, String str) {
    }

    public final String getId() {
        return getClass().getName();
    }

    public EnumC20657015sO getState() {
        return getStateWrapper().LIZ;
    }

    public AbstractC20661115t3 getDependency() {
        return new AbstractC20661115t3() { // from class: X.15t1
            public final String toString() {
                return "Default";
            }
        };
    }

    public final String getElementLabel() {
        return this.elementLabel;
    }

    public EnumC1202290hON getPopupType() {
        return EnumC1202290hON.POPUP;
    }

    public final InterfaceC20658015sY getScene() {
        return this.scene;
    }

    @Override // X.InterfaceC20660515sx
    public C20656615sK getStateWrapper() {
        return this.stateWrapper;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public AbstractC20656215sG(InterfaceC20658015sY interfaceC20658015sY) {
        this.scene = interfaceC20658015sY;
        C20656615sK c20656615sK = new C20656615sK(EnumC20657015sO.PENDING);
        C20657215sQ c20657215sQ = new C20657215sQ(this);
        synchronized (c20656615sK) {
            ((ArrayList) c20656615sK.LIZIZ).add(c20657215sQ);
        }
        this.stateWrapper = c20656615sK;
        this.elementLabel = "";
        this.triggerId = "";
    }

    public final void setElementLabel(String str) {
        this.elementLabel = str;
    }

    public final void setTriggerId(String str) {
        this.triggerId = str;
    }
}
