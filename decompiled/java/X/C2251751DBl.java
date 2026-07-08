package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251751DBl extends Message<C2251751DBl, C2251761DBm> {
    public static final ProtoAdapter<C2251751DBl> ADAPTER = new ProtoAdapter<C2251751DBl>() { // from class: X.1DBk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251751DBl decode(ProtoReader protoReader) {
            C2251761DBm c2251761DBm = new C2251761DBm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251761DBm.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c2251761DBm.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2251761DBm.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2251761DBm.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c2251761DBm.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251761DBm.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c2251761DBm.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2251761DBm.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251761DBm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251761DBm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251751DBl c2251751DBl) {
            C2251751DBl c2251751DBl2 = c2251751DBl;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2251751DBl2.should_carry_video_data);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2251751DBl2.non_personalization_config) + protoAdapter2.encodedSizeWithTag(3, c2251751DBl2.carry_video_data_size_kb) + protoAdapter.encodedSizeWithTag(4, c2251751DBl2.is_dynamic_arrangement_enabled) + ProtoAdapter.STRING.encodedSizeWithTag(5, c2251751DBl2.attribution_deep_link) + protoAdapter.encodedSizeWithTag(6, c2251751DBl2.should_try_nuj_force_insertion) + ProtoAdapter.INT64.encodedSizeWithTag(7, c2251751DBl2.latest_install_time) + protoAdapter.encodedSizeWithTag(8, c2251751DBl2.is_latest_install_time_within_24h) + c2251751DBl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251751DBl c2251751DBl) {
            C2251751DBl c2251751DBl2 = c2251751DBl;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251751DBl2.should_carry_video_data);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2251751DBl2.non_personalization_config);
            protoAdapter2.encodeWithTag(protoWriter, 3, c2251751DBl2.carry_video_data_size_kb);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251751DBl2.is_dynamic_arrangement_enabled);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c2251751DBl2.attribution_deep_link);
            protoAdapter.encodeWithTag(protoWriter, 6, c2251751DBl2.should_try_nuj_force_insertion);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, c2251751DBl2.latest_install_time);
            protoAdapter.encodeWithTag(protoWriter, 8, c2251751DBl2.is_latest_install_time_within_24h);
            protoWriter.writeBytes(c2251751DBl2.unknownFields());
        }
    };
    public String attribution_deep_link;
    public Integer carry_video_data_size_kb;
    public Boolean is_dynamic_arrangement_enabled;
    public Boolean is_latest_install_time_within_24h;
    public Long latest_install_time;
    public Integer non_personalization_config;
    public Boolean should_carry_video_data;
    public Boolean should_try_nuj_force_insertion;

    @Override // com.squareup.wire.Message
    public C2251761DBm newBuilder() {
        return null;
    }

    public C2251751DBl(Boolean bool, Integer num, Integer num2, Boolean bool2, String str, Boolean bool3, Long l, Boolean bool4) {
        this(bool, num, num2, bool2, str, bool3, l, bool4, ByteString.EMPTY);
    }

    public C2251751DBl(Boolean bool, Integer num, Integer num2, Boolean bool2, String str, Boolean bool3, Long l, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.should_carry_video_data = bool;
        this.non_personalization_config = num;
        this.carry_video_data_size_kb = num2;
        this.is_dynamic_arrangement_enabled = bool2;
        this.attribution_deep_link = str;
        this.should_try_nuj_force_insertion = bool3;
        this.latest_install_time = l;
        this.is_latest_install_time_within_24h = bool4;
    }
}
