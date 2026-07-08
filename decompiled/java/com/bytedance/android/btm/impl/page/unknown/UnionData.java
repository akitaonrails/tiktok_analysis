package com.bytedance.android.btm.impl.page.unknown;

import X.C13LE;
import X.C18DY;
import X.C21247618Da;
import X.C2217371BqR;
import X.C801030VbZ;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public class UnionData implements Serializable {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final C21247618Da Companion;
    public static final long serialVersionUID = 20221017;
    public String className;
    public String pageBtm;
    public final LazyNonNull pageId$delegate = LazyKt.INSTANCE.lazyNonNull(new C18DY());
    public String unionPre;
    public int unionStep;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.18Da] */
    static {
        C2217371BqR c2217371BqR = new C2217371BqR(UnionData.class, "pageId", "getPageId()Ljava/lang/String;", 0);
        C13LE.LIZ.getClass();
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR};
        Companion = new Object() { // from class: X.18Da
        };
    }

    public final String getPageId() {
        return (String) this.pageId$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public UnionData() {
        if (BtmServiceImpl.INSTANCE.getOpenPerfOpt()) {
            return;
        }
        setPageId(C801030VbZ.LIZIZ());
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getPageBtm() {
        return this.pageBtm;
    }

    public final String getUnionPre() {
        return this.unionPre;
    }

    public final int getUnionStep() {
        return this.unionStep;
    }

    public final void setClassName(String str) {
        this.className = str;
    }

    public final void setPageBtm(String str) {
        this.pageBtm = str;
    }

    public final void setPageId(String str) {
        this.pageId$delegate.setValue(this, $$delegatedProperties[0], str);
    }

    public final void setUnionPre(String str) {
        this.unionPre = str;
    }

    public final void setUnionStep(int i) {
        this.unionStep = i;
    }
}
