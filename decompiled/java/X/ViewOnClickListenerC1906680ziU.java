package X;

import Y.ATListenerS460S0100000_28;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0ziU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewOnClickListenerC1906680ziU extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public EnumC1906770zid imgInfo;
    public BaseNotice mBaseNotice;
    public InterfaceC1906690ziV mClickListener;
    public Fragment mFragment;
    public boolean mIsRTL;
    public View mItemView;
    public LifecycleOwner mLifecycleOwner;
    public int mPosition;
    public Map<String, BaseNotice> mReadedNotices;
    public String mVcdToastText;
    public InterfaceC1906670ziT viewHolderPositionDelegate;
    public InterfaceC1906840zik vm;

    public boolean needLongClick() {
        return false;
    }

    public void onAttached() {
    }

    public void onDetached() {
    }

    public void onLifecycleSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLongClick$0() {
        View view = this.mItemView;
        if (view == null || view.getParent() == null) {
            return;
        }
        this.mItemView.getParent().requestDisallowInterceptTouchEvent(true);
    }

    public int getWrappedLayoutPosition() {
        InterfaceC1906670ziT interfaceC1906670ziT = this.viewHolderPositionDelegate;
        if (interfaceC1906670ziT != null) {
            return interfaceC1906670ziT.s0();
        }
        int layoutPosition = getLayoutPosition();
        return layoutPosition < 0 ? this.mPosition : layoutPosition;
    }

    public LifecycleOwner requireLifeCycleOwner() {
        if (this.mLifecycleOwner == null) {
            Object context = this.itemView.getContext();
            if (context instanceof C19FO) {
                return (LifecycleOwner) context;
            }
        }
        return this.mLifecycleOwner;
    }

    public int getWrappedAdapterPosition() {
        int adapterPosition = getAdapterPosition();
        return adapterPosition < 0 ? this.mPosition : adapterPosition;
    }

    public void onItemClick() {
        int wrappedLayoutPosition = getWrappedLayoutPosition();
        InterfaceC1906690ziV interfaceC1906690ziV = this.mClickListener;
        if (interfaceC1906690ziV == null || wrappedLayoutPosition <= -1) {
            return;
        }
        interfaceC1906690ziV.LIZ(wrappedLayoutPosition);
    }

    public void onItemClickFinish() {
        int wrappedLayoutPosition = getWrappedLayoutPosition();
        InterfaceC1906690ziV interfaceC1906690ziV = this.mClickListener;
        if (interfaceC1906690ziV == null || wrappedLayoutPosition <= -1) {
            return;
        }
        interfaceC1906690ziV.LLJIJIL();
    }

    public Fragment getFragment() {
        return this.mFragment;
    }

    public ViewOnClickListenerC1906680ziU(View view) {
        super(view);
        this.mPosition = -1;
        this.imgInfo = EnumC1906770zid.OTHER;
        this.mItemView = view;
        if (needLongClick()) {
            this.mItemView.setOnLongClickListener(this);
            this.mItemView.setOnTouchListener(new ATListenerS460S0100000_28(this, 2));
        }
    }

    public static String matchAid(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = PatternProtector.compile("\\d+\\d$").matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group();
    }

    public <T extends View> T findViewById(int i) {
        return (T) this.itemView.findViewById(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        refreshReadState(true);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        int wrappedLayoutPosition = getWrappedLayoutPosition();
        if (this.mClickListener != null && wrappedLayoutPosition > -1 && needLongClick()) {
            this.mClickListener.LLJLLIL(wrappedLayoutPosition, new C1242320iQw(this));
            return true;
        }
        return true;
    }

    public void refreshReadState(boolean z) {
        Map<String, BaseNotice> map;
        BaseNotice baseNotice;
        if (z && (map = this.mReadedNotices) != null && (baseNotice = this.mBaseNotice) != null) {
            map.put(baseNotice.nid, baseNotice);
        }
    }

    public void setFragment(Fragment fragment) {
        this.mFragment = fragment;
    }

    public void setImgInfo(EnumC1906770zid enumC1906770zid) {
        this.imgInfo = enumC1906770zid;
    }

    public void setItemClickListener(InterfaceC1906690ziV interfaceC1906690ziV) {
        this.mClickListener = interfaceC1906690ziV;
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.mLifecycleOwner = lifecycleOwner;
        onLifecycleSet();
    }

    public void setViewHolderPositionDelegate(InterfaceC1906670ziT interfaceC1906670ziT) {
        this.viewHolderPositionDelegate = interfaceC1906670ziT;
    }

    public void bind(BaseNotice baseNotice, boolean z, String str) {
        this.mBaseNotice = baseNotice;
    }

    public void bind(Map<String, BaseNotice> map, BaseNotice baseNotice, boolean z, String str) {
        this.mReadedNotices = map;
        bind(baseNotice, z, str);
    }

    public static void logEnterPersonalDetail(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5 = C1900870zZ7.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                }
            }
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("position", str5);
        c2344009Gk.LJIIIIZZ("account_type", str4);
        c2344009Gk.LJIIIIZZ("to_user_id", str);
        c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
        C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
    }

    public void bind(Map<String, BaseNotice> map, BaseNotice baseNotice, boolean z, String str, String str2) {
        this.mVcdToastText = str2;
        bind(map, baseNotice, z, str);
    }
}
