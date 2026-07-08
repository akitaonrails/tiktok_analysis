package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.ThumbnailMapViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS16S0300100_26;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0wJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776170wJz extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1776170wJz(C1725680v0Y c1725680v0Y, C1725680v0Y c1725680v0Y2, CompletionBlock<InterfaceC1725700v0a> completionBlock) {
        super(4);
        this.$t = completionBlock;
        this.l0 = c1725680v0Y;
        this.l1 = c1725680v0Y2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776170wJz(ViewGroup viewGroup, ThumbnailMapViewHolder thumbnailMapViewHolder, int i) {
        super(4);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = thumbnailMapViewHolder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C1776170wJz c1776170wJz, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        Object next;
        String string;
        boolean z2;
        FragmentManager fragmentManagerDS;
        C19EH c19ehLJIIJ;
        C1745300vWC c1745300vWC;
        Object next2;
        C1745340vWG c1745340vWG;
        List<Region> list;
        Region region;
        String str;
        Object obj5;
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
        List list2 = (List) obj2;
        C1177960gl8 c1177960gl8 = (C1177960gl8) obj3;
        ((Boolean) obj4).booleanValue();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                Integer num = ((C1745680vWo) it2.next()).LIZ.type;
                if (num != null && num.intValue() == 19) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Iterator it3 = list2.iterator();
        while (true) {
            layoutParams = null;
            if (it3.hasNext()) {
                next = it3.next();
                Integer num2 = ((C1745680vWo) next).LIZ.type;
                if (num2 != null && num2.intValue() == 12) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1745680vWo c1745680vWo = (C1745680vWo) next;
        if (c1745680vWo != null && (obj5 = c1745680vWo.LIZIZ) != null) {
            string = obj5.toString();
        } else {
            string = null;
        }
        if (C703302op.LIZ(string)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z || z2) && c1177960gl8 != null) {
            View view = viewHolder.itemView;
            if ((view instanceof C1745300vWC) && (c1745300vWC = (C1745300vWC) view) != null) {
                ThumbnailMapViewHolder thumbnailMapViewHolder = (ThumbnailMapViewHolder) c1776170wJz.l1;
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        Integer num3 = ((C1745680vWo) next2).LIZ.type;
                        if (num3 != null && num3.intValue() == 13) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C1745680vWo c1745680vWo2 = (C1745680vWo) next2;
                if (c1745680vWo2 != null) {
                    c1745340vWG = c1745680vWo2.LIZJ;
                    if (c1745340vWG != null) {
                        Integer num4 = c1745340vWG.LJ;
                        int value = EnumC1988307qb.ADDRESS_REGION_NEED_UPDATE.getValue();
                        if (num4 != null && num4.intValue() == value && (list = thumbnailMapViewHolder.a6().LLJJI) != null && (region = (Region) C13LP.LJJLIIIJL(list)) != null && (str = region.geoNameId) != null && !((ArrayList) thumbnailMapViewHolder.a6().LLJJIII).contains(str)) {
                            ((ArrayList) thumbnailMapViewHolder.a6().LLJJIII).add(str);
                        }
                    }
                } else {
                    c1745340vWG = null;
                }
                C1745330vWF.LIZ(true, c1745340vWG, c1745300vWC);
            }
            ThumbnailMapViewHolder thumbnailMapViewHolder2 = (ThumbnailMapViewHolder) c1776170wJz.l1;
            ViewGroup viewGroup = (ViewGroup) c1776170wJz.l0;
            AddressEditFragment addressEditFragment = thumbnailMapViewHolder2.LLJILJILJ;
            Fragment fragment = addressEditFragment.LLLI;
            if (fragment != null && (fragmentManagerDS = addressEditFragment.dS()) != null && (c19ehLJIIJ = fragmentManagerDS.LJIIJ()) != null) {
                c19ehLJIIJ.LJIJ(R.id.xup, fragment, null);
                c19ehLJIIJ.LJIIJ();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C03UB c03ub = thumbnailMapViewHolder2.LLJILJILJ.LLLFZ;
            if (c03ub != null) {
                c03ub.X(new AwS16S0300100_26(thumbnailMapViewHolder2, c1177960gl8, viewGroup, jCurrentTimeMillis, 1));
            }
        } else {
            ViewGroup viewGroup2 = (ViewGroup) c1776170wJz.l0;
            if (viewGroup2 != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            }
            ViewGroup viewGroup3 = (ViewGroup) c1776170wJz.l0;
            if (viewGroup3 != null) {
                C786410Ut5.X5(layoutParams, viewGroup3);
            }
            ViewGroup viewGroup4 = (ViewGroup) c1776170wJz.l0;
            if (viewGroup4 != null) {
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), viewGroup4);
            }
            ViewGroup viewGroup5 = (ViewGroup) c1776170wJz.l0;
            if (viewGroup5 != null) {
                C786410Ut5.LJLZ(8, viewGroup5);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1776170wJz c1776170wJz, Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int iIntValue;
        String str = (String) obj;
        String str2 = (String) obj2;
        Integer num = (Integer) obj3;
        String str3 = (String) obj4;
        if (str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String containerID = null;
        if (z && num != null && num.intValue() == 0) {
            InterfaceC634840OvC interfaceC634840OvC = ((C1725680v0Y) c1776170wJz.l0).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            InterfaceC1725700v0a interfaceC1725700v0a = (InterfaceC1725700v0a) C1909107dp.LIZJ(InterfaceC1725700v0a.class, containerID);
            interfaceC1725700v0a.setContactName(str);
            interfaceC1725700v0a.setPhoneNumber(u.LJJIFFI(str2, " ", "", false));
            ((CompletionBlock) c1776170wJz.l1).onSuccess(interfaceC1725700v0a, "");
        } else {
            CompletionBlock completionBlock = (CompletionBlock) c1776170wJz.l1;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -10000;
            }
            if (str3 == null) {
                str3 = "unknown error";
            }
            C2382909Vj.LIZ(completionBlock, iIntValue, str3, null, 4);
        }
        return Unit.LIZ;
    }
}
