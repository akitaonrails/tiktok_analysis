package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554102Dz extends Message<C554102Dz, C566802Iw> {
    public static final ProtoAdapter<C554102Dz> ADAPTER = new ProtoAdapter<C554102Dz>() { // from class: X.0288
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554102Dz decode(ProtoReader protoReader) {
            C554102Dz c554102Dz = new C554102Dz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c554102Dz.light_up = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c554102Dz.is_fan = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c554102Dz.fans_level = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c554102Dz.fans_name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554102Dz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554102Dz c554102Dz) {
            C554102Dz c554102Dz2 = c554102Dz;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c554102Dz2.fans_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, c554102Dz2.fans_level);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c554102Dz2.is_fan) + protoAdapter.encodedSizeWithTag(4, c554102Dz2.light_up) + c554102Dz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C554102Dz c554102Dz) {
            C554102Dz c554102Dz2 = c554102Dz;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c554102Dz2.fans_name);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c554102Dz2.fans_level);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 3, c554102Dz2.is_fan);
            protoAdapter.encodeWithTag(protoWriter, 4, c554102Dz2.light_up);
            protoWriter.writeBytes(c554102Dz2.unknownFields());
        }
    };
    public Integer fans_level;
    public String fans_name;
    public Boolean is_fan;
    public Boolean light_up;

    public C554102Dz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C566802Iw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
