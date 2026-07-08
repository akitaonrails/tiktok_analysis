package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.List;

/* JADX INFO: renamed from: X.14uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC20415514uX extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "first_level_tag_translated_name", required = true)
    String getFirstLevelTagTranslatedName();

    @InterfaceC1909207dq(option = {0, 1, 2, 3, 4, 5, 6, 7})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "playbook_first_level_tag_type", required = true)
    Number getPlaybookFirstLevelTagType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tags", nestedClassType = InterfaceC20415614uY.class, required = true)
    List<InterfaceC20415614uY> getTags();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "first_level_tag_translated_name", required = true)
    void setFirstLevelTagTranslatedName(String str);

    @InterfaceC1909207dq(option = {0, 1, 2, 3, 4, 5, 6, 7})
    @InterfaceC1549470qQL(isEnum = true, isGetter = false, keyPath = "playbook_first_level_tag_type", required = true)
    void setPlaybookFirstLevelTagType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tags", nestedClassType = InterfaceC20415614uY.class, required = true)
    void setTags(List<? extends InterfaceC20415614uY> list);
}
