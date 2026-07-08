package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.imagelist.SearchNimbleImageListAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.markdown.SearchNimbleMarkdownAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.text.SearchNimbleTextAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videolist.SearchNimbleDocListAssem;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videostack.SearchNimbleVideoStackAssem;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685240QuI {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC685300QuO LIZ(final Template template, Context context, InterfaceC685300QuO interfaceC685300QuO, final ViewGroup viewGroup) {
        boolean z;
        Template templateLLJJ;
        C19719912Dl c19719912DlLIZ;
        Template templateLLJJ2;
        String str;
        Template templateLLJJ3;
        List<Template> list = template.subComponents;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Template templateLLJJ4 = null;
        final Template templateLLJJ5 = null;
        String str2 = null;
        if (z) {
            EnumC685250QuJ enumC685250QuJ = EnumC685250QuJ.FLEX;
            if (C13LP.LJJJJ(template.name, C1697810uHb.LJIIJJI(EnumC685250QuJ.VIEW.getValue(), enumC685250QuJ.getValue()))) {
                if (Intrinsics.LJFF(template.name, enumC685250QuJ.getValue())) {
                    if (interfaceC685300QuO != null && (templateLLJJ3 = interfaceC685300QuO.LLJJ()) != null) {
                        str = templateLLJJ3.axis;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, C017U.VERTICAL.getValue())) {
                        return null;
                    }
                }
                if (interfaceC685300QuO != null) {
                    templateLLJJ5 = interfaceC685300QuO.LLJJ();
                }
                final View view = new View(context);
                view.setId(View.generateViewId());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(template.name);
                sbLIZ.append(template.index);
                view.setTag(C2188811AlT.LIZIZ(sbLIZ));
                return new InterfaceC685300QuO(template, templateLLJJ5, viewGroup, view) { // from class: X.0QuN
                    public final Template LIZ;
                    public final Template LIZIZ;
                    public final ViewGroup LIZJ;
                    public final View LIZLLL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C685290QuN)) {
                            return false;
                        }
                        C685290QuN c685290QuN = (C685290QuN) obj;
                        return Intrinsics.LJFF(this.LIZ, c685290QuN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c685290QuN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c685290QuN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c685290QuN.LIZLLL);
                    }

                    public final int hashCode() {
                        int iHashCode = this.LIZ.hashCode() * 31;
                        Template template2 = this.LIZIZ;
                        int iHashCode2 = (iHashCode + (template2 == null ? 0 : template2.hashCode())) * 31;
                        ViewGroup viewGroup2 = this.LIZJ;
                        return ((iHashCode2 + (viewGroup2 != null ? viewGroup2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("SearchNimbleViewNode(template=");
                        sbLIZ2.append(this.LIZ);
                        sbLIZ2.append(", parentTemplate=");
                        sbLIZ2.append(this.LIZIZ);
                        sbLIZ2.append(", parentLayout=");
                        sbLIZ2.append(this.LIZJ);
                        sbLIZ2.append(", container=");
                        sbLIZ2.append(this.LIZLLL);
                        sbLIZ2.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ2);
                    }

                    @Override // X.InterfaceC685300QuO
                    public final View LJIJI() {
                        return this.LIZLLL;
                    }

                    @Override // X.InterfaceC685300QuO
                    public final Template LLJJ() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC685300QuO
                    public final ViewGroup LLJJI() {
                        return this.LIZJ;
                    }

                    {
                        this.LIZ = template;
                        this.LIZIZ = templateLLJJ5;
                        this.LIZJ = viewGroup;
                        this.LIZLLL = view;
                    }
                };
            }
            if (interfaceC685300QuO != null) {
                templateLLJJ = interfaceC685300QuO.LLJJ();
            } else {
                templateLLJJ = null;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(View.generateViewId());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(template.name);
            sbLIZ2.append(template.index);
            frameLayout.setTag(C2188811AlT.LIZIZ(sbLIZ2));
            String str3 = template.name;
            if (Intrinsics.LJFF(str3, EnumC685250QuJ.TEXT.getValue())) {
                c19719912DlLIZ = C13LE.LIZ(SearchNimbleTextAssem.class);
            } else if (Intrinsics.LJFF(str3, EnumC685250QuJ.MARKDOWN.getValue())) {
                c19719912DlLIZ = C13LE.LIZ(SearchNimbleMarkdownAssem.class);
            } else if (Intrinsics.LJFF(str3, EnumC685250QuJ.VIDEO.getValue())) {
                c19719912DlLIZ = C13LE.LIZ(SearchNimbleDocListAssem.class);
            } else if (Intrinsics.LJFF(str3, EnumC685250QuJ.VIDEO_STACK.getValue())) {
                c19719912DlLIZ = C13LE.LIZ(SearchNimbleVideoStackAssem.class);
            } else if (Intrinsics.LJFF(str3, EnumC685250QuJ.IMAGE.getValue())) {
                c19719912DlLIZ = C13LE.LIZ(SearchNimbleImageListAssem.class);
            } else {
                C01V6.LIZIZ(2, null, template.name, null, 26);
                c19719912DlLIZ = null;
            }
            C685280QuM c685280QuM = new C685280QuM(template, templateLLJJ, viewGroup, frameLayout, c19719912DlLIZ);
            if (interfaceC685300QuO != null) {
                templateLLJJ2 = interfaceC685300QuO.LLJJ();
            } else {
                templateLLJJ2 = null;
            }
            Integer num = template.index;
            if (templateLLJJ2 != null) {
                str2 = templateLLJJ2.name;
            }
            String str4 = template.name;
            if (str2 != null && str4 != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C684980Qts.LIZ.getValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str2);
                sbLIZ3.append('_');
                sbLIZ3.append(str4);
                List<Template> list2 = (List) concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ3));
                if (list2 != null) {
                    for (Template template2 : list2) {
                        if (!Intrinsics.LJFF(template2.name, str4) || !Intrinsics.LJFF(template2.index, num)) {
                        }
                    }
                    list2.add(template);
                    return c685280QuM;
                }
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C684980Qts.LIZ.getValue();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str2);
                sbLIZ4.append('_');
                sbLIZ4.append(str4);
                concurrentHashMap2.put(C2188811AlT.LIZIZ(sbLIZ4), C1697810uHb.LJIILJJIL(template));
                return c685280QuM;
            }
            return c685280QuM;
        }
        if (interfaceC685300QuO != null) {
            templateLLJJ4 = interfaceC685300QuO.LLJJ();
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(View.generateViewId());
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setTag("layout");
        return new C685270QuL(template, templateLLJJ4, viewGroup, constraintLayout);
    }
}
