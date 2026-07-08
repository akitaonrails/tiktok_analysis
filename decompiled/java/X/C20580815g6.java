package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarBaseFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarGeneratedFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarSocialFragment;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15g6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20580815g6 extends FragmentStateAdapter {
    public final EnumMap<EnumC1405120mfW, Fragment> LLJI;
    public List<? extends Function0<? extends Fragment>> LLJIJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJIJIL.size();
    }

    public C20580815g6(Fragment fragment) {
        super(fragment);
        EnumMap<EnumC1405120mfW, Fragment> enumMap = new EnumMap<>(EnumC1405120mfW.class);
        enumMap.put(EnumC1405120mfW.DEFAULT, new StoryThoughtAvatarBaseFragment());
        enumMap.put(EnumC1405120mfW.SOCIAL_AVATAR, new StoryThoughtAvatarSocialFragment());
        enumMap.put(EnumC1405120mfW.GENERATED_AVATAR, new StoryThoughtAvatarGeneratedFragment());
        this.LLJI = enumMap;
        this.LLJIJIL = new ArrayList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        return (Fragment) ((Function0) ListProtector.get(this.LLJIJIL, i)).invoke();
    }
}
