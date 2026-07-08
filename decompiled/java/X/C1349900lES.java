package X;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0lES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349900lES implements Serializable {
    public final transient InterfaceC1350200lEw commentNestedLayoutStatusListener;
    public final Boolean needProxyBackPressEvent;
    public final List<Integer> registerPanelList;
    public final Boolean showXIcon;
    public final Integer specifiedCommentHeightPx;
    public final boolean useStoryCommentStyle;

    public C1349900lES() {
        this(false, null, null, Boolean.FALSE, null, Boolean.FALSE);
    }

    public final boolean isCommentFirst() {
        Integer num;
        List<Integer> list = this.registerPanelList;
        return (list == null || (num = (Integer) C13LP.LJJJLL(list)) == null || num.intValue() != 1) ? false : true;
    }

    public final boolean needUseSpecifiedCommentHeight() {
        Integer num;
        return this.useStoryCommentStyle && (num = this.specifiedCommentHeightPx) != null && num.intValue() > 0;
    }

    public C1349900lES(boolean z, Integer num, List<Integer> list, Boolean bool, InterfaceC1350200lEw interfaceC1350200lEw, Boolean bool2) {
        this.useStoryCommentStyle = z;
        this.specifiedCommentHeightPx = num;
        this.registerPanelList = list;
        this.needProxyBackPressEvent = bool;
        this.commentNestedLayoutStatusListener = interfaceC1350200lEw;
        this.showXIcon = bool2;
    }
}
